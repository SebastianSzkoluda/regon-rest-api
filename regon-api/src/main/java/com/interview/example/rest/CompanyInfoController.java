package com.interview.example.rest;

import com.interview.example.model.ComapnyInfo;
import com.interview.example.service.SendRequestService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.xml.soap.SOAPException;
import java.io.IOException;

@RestController
@RequestMapping("/api/regon/company")
public class CompanyInfoController {

    @GetMapping
    public ResponseEntity<ComapnyInfo> getCompanyInfo(@RequestParam String regon) throws IllegalAccessException, SOAPException, IOException {
        return new ResponseEntity<>(SendRequestService.getCompanyDetailsRaport(regon), HttpStatus.OK);
    }
}
