package com.interview.example.service;

import com.interview.example.model.ComapnyInfo;
import org.springframework.http.HttpEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.StringHttpMessageConverter;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestTemplate;

import javax.xml.soap.SOAPException;
import javax.xml.soap.SOAPMessage;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.Objects;

import static com.interview.example.util.FileReader.readFile;
import static com.interview.example.util.HelperUtil.*;


public class SendRequestService {

    private static final String BIR_URL = "https://wyszukiwarkaregontest.stat.gov.pl/wsBIR/UslugaBIRzewnPubl.svc";


    private static String login() throws SOAPException, IOException {

        String loginSoap = readFile("LoginSoap.txt");
        RestTemplate restTemplate = new RestTemplate();

        MultiValueMap<String, String> headers = new LinkedMultiValueMap<>();
        headers.add("Content-Type", "application/soap+xml");

        HttpEntity<String> entity = new HttpEntity<>(loginSoap, headers);

        ResponseEntity<String> response = restTemplate.postForEntity(BIR_URL, entity, String.class);

        String envelope = getEnvelope(response.getBody());

        SOAPMessage soapMessage = parseToSOAPMessage(envelope);

        return soapMessage.getSOAPBody().getElementsByTagName("ZalogujResult").item(0).getTextContent();
    }

    public static ComapnyInfo getCompanyDetailsRaport(String regon) throws IOException, SOAPException, IllegalAccessException {

        String raportSoap = readFile("CompanyRaportSoap.txt");
        String sid = login();
        String requestBody = String.format(raportSoap, regon);
        RestTemplate restTemplate = new RestTemplate();

        MultiValueMap<String, String> headers = new LinkedMultiValueMap<>();
        headers.add("Content-Type", "application/soap+xml");
        headers.add("sid", sid);

        HttpEntity<String> entity = new HttpEntity<>(requestBody, headers);

        restTemplate.getMessageConverters()
                .add(0, new StringHttpMessageConverter(Charset.forName("UTF-8")));

        ResponseEntity<String> response = restTemplate.postForEntity(BIR_URL, entity, String.class);

        String raportEnvelope = clearSOAPResponse(Objects.requireNonNull(response.getBody()));

        SOAPMessage soapMessage = parseToSOAPMessage(raportEnvelope);

        return parseSOAPMessageToCompanyInfoObject(soapMessage);
    }
}
