package com.interview.example.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.xml.bind.annotation.XmlElement;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CompanyInfo {

    private String Regon;
    private String RegonLink;
    private String Nazwa;
    private String Wojewodztwo;
    private String Powiat;
    private String Gmina;
    private String Miejscowosc;
    private String KodPocztowy;
    private String Ulica;
    private String Typ;
    private String SilosID;

    @XmlElement(name = "Regon")
    public void setRegon(String regon) {
        Regon = regon;
    }

    @XmlElement(name = "RegonLink")
    public void setRegonLink(String regonLink) {
        RegonLink = regonLink;
    }

    @XmlElement(name = "Nazwa")
    public void setNazwa(String nazwa) {
        Nazwa = nazwa;
    }

    @XmlElement(name = "Wojewodztwo")
    public void setWojewodztwo(String wojewodztwo) {
        Wojewodztwo = wojewodztwo;
    }

    @XmlElement(name = "Powiat")
    public void setPowiat(String powiat) {
        Powiat = powiat;
    }

    @XmlElement(name = "Gmina")
    public void setGmina(String gmina) {
        Gmina = gmina;
    }

    @XmlElement(name = "Miejscowosc")
    public void setMiejscowosc(String miejscowosc) {
        Miejscowosc = miejscowosc;
    }

    @XmlElement(name = "KodPocztowy")
    public void setKodPocztowy(String kodPocztowy) {
        KodPocztowy = kodPocztowy;
    }

    @XmlElement(name = "Ulica")
    public void setUlica(String ulica) {
        Ulica = ulica;
    }

    @XmlElement(name = "Typ")
    public void setTyp(String typ) {
        Typ = typ;
    }

    @XmlElement(name = "SilosID")
    public void setSilosID(String silosID) {
        SilosID = silosID;
    }
}
