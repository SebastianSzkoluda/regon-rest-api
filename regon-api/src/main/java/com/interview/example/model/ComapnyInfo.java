package com.interview.example.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ComapnyInfo {

    private String praw_nip;
    private String praw_nazwa;
    private String praw_nazwaSkrocona;
    private String praw_numerWrejestrzeEwidencji;
    private String praw_dataPowstania;
    private String praw_dataRozpoczeciaDzialalnosci;
    private String praw_dataZaistnieniaZmiany;
    private String praw_numerTelefonu;
    private String praw_adSiedzKraj_Nazwa;
    private String praw_adSiedzWojewodztwo_Nazwa;
    private String praw_adSiedzPowiat_Nazwa;
    private String praw_adSiedzGmina_Nazwa;
    private String praw_adSiedzMiejscowosc_Nazwa;
    private String praw_adSiedzMiejscowoscPoczty_Nazwa;
    private String praw_adSiedzUlica_Nazwa;
}
