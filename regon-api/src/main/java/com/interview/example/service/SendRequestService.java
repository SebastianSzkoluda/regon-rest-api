package com.interview.example.service;

import com.interview.example.model.CompanyInfo;
import com.interview.example.util.SoapHandlerResolver;
import com.interview.example.util.SoapMessageHandler;
import com.interview.example.wsdl.IUslugaBIRzewnPubl;
import com.interview.example.wsdl.ObjectFactory;
import com.interview.example.wsdl.ParametryWyszukiwania;
import com.interview.example.wsdl.UslugaBIRzewnPubl;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.ws.soap.AddressingFeature;

import static com.interview.example.util.HelperUtil.parseResponseToCompanyInfoObject;


public class SendRequestService {

    public static CompanyInfo daneSzukaj(String nip) throws JAXBException {
        UslugaBIRzewnPubl service = new UslugaBIRzewnPubl();
        SoapMessageHandler soapMessageHandler = new SoapMessageHandler();
        service.setHandlerResolver(new SoapHandlerResolver(soapMessageHandler)); //<- doklejanie SID'a do HTTP HEADER
        IUslugaBIRzewnPubl port = service.getE3(new AddressingFeature());
        String statusUslugi = "StatusUslugi";
        String result = port.getValue(statusUslugi);
        // logowanie, jezeli sesja wygasla, badx logowanie pierwszy raz
        if ((soapMessageHandler.getSessionCookie().equals("")) || (!result.equals("1"))) {
            String sid = port.zaloguj("abcde12345abcde12345");
            soapMessageHandler.setSessionCookie(sid);
        }
        // przykład wyszukiwania po NIPie
        ObjectFactory objectFactory = new ObjectFactory();
        JAXBElement<String> nipParam = objectFactory.createParametryWyszukiwaniaNip(nip);
        ParametryWyszukiwania parametryWyszukiwania = new ParametryWyszukiwania();
        parametryWyszukiwania.setNip(nipParam);
        String raport = port.daneSzukaj(parametryWyszukiwania);
        System.out.println(raport);
        return parseResponseToCompanyInfoObject(raport);
    }
}
