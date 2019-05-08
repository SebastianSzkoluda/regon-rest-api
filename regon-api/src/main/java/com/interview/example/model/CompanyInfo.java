package com.interview.example.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

@Data
@NoArgsConstructor
@AllArgsConstructor
@XmlAccessorType(XmlAccessType.FIELD)
public class CompanyInfo {

    @XmlElement(name = "Regon")
    private String regon;
    @XmlElement(name = "RegonLink")
    private String regonLink;
    @XmlElement(name = "Nazwa")
    private String name;
    @XmlElement(name = "Wojewodztwo")
    private String voivodeship;
    @XmlElement(name = "Powiat")
    private String district;
    @XmlElement(name = "Gmina")
    private String community;
    @XmlElement(name = "Miejscowosc")
    private String city;
    @XmlElement(name = "KodPocztowy")
    private String zipCode;
    @XmlElement(name = "Ulica")
    private String street;
    @XmlElement(name = "Typ")
    private String type;
    @XmlElement(name = "SilosID")
    private String silosId;
}
