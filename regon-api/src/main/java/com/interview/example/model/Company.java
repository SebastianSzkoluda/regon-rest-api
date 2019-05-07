package com.interview.example.model;

import lombok.Getter;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement( name = "root" )
public class Company {

    @Getter
    CompanyInfo companyInfo;

    @XmlElement( name = "dane")
    public void setCompanyInfo(CompanyInfo companyInfo) {
        this.companyInfo = companyInfo;
    }


}
