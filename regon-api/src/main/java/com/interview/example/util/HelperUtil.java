package com.interview.example.util;

import com.interview.example.model.CompanyInfo;
import com.interview.example.model.Company;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.io.ByteArrayInputStream;

public class HelperUtil {

    public static CompanyInfo parseResponseToCompanyInfoObject(String response) throws JAXBException {
        JAXBContext jaxbContext = JAXBContext.newInstance(Company.class);
        Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
        Company company = (Company) jaxbUnmarshaller.unmarshal(new ByteArrayInputStream(response.getBytes()));
        System.out.println(company.getCompanyInfo());
        return company.getCompanyInfo();
    }

}
