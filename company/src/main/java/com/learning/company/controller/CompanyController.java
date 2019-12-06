package com.learning.company.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.learning.company.entity.CompanyEntity;
import com.learning.company.model.Company;
import com.learning.company.service.ICompanyService;

@RestController
@CrossOrigin
@RequestMapping({ "/company" })
public class CompanyController {
	
    @Autowired
    private ICompanyService companyService;
	
    @RequestMapping(value = "/findAll",method = RequestMethod.GET,
            produces = "application/json")
	public ResponseEntity<List<CompanyEntity>> findAllCompany() {
    	
    	List<CompanyEntity> companyList = companyService.findAllCompany();
        if(companyList == null || companyList.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<>(companyList, HttpStatus.OK);
	}
    
    
    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public ResponseEntity<Void> createService(@RequestBody Company company) {

    	companyService.save(company);

        HttpHeaders headers = new HttpHeaders();
        return new ResponseEntity<Void>(headers, HttpStatus.CREATED);
    }

}
