package com.interview.example.rest;

import com.interview.example.model.CompanyInfo;
import com.interview.example.service.SendRequestService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.xml.bind.JAXBException;

@RestController
@RequestMapping("/api/regon/company")
public class CompanyInfoController {

    @GetMapping
    public ResponseEntity<CompanyInfo> getCompanyInfo(@RequestParam String nip) throws JAXBException {
        return new ResponseEntity<>(SendRequestService.searchCompanyDataByNip(nip), HttpStatus.OK);
    }
}
