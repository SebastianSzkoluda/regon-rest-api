package com.interview.example.util;

import com.interview.example.model.CompanyInfo;
import com.interview.example.model.CompanyRoot;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.io.StringReader;

public class HelperUtil {

    public static CompanyInfo parseResponseToCompanyInfoObject(String response) throws JAXBException {
        JAXBContext jaxbContext = JAXBContext.newInstance(CompanyRoot.class);
        Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
        CompanyRoot companyRoot = (CompanyRoot) jaxbUnmarshaller.unmarshal(new StringReader(response));
        return companyRoot.getCompanyInfo();
    }

}
