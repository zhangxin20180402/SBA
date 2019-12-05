package com.learning.company.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.learning.company.entity.CompanyEntity;
import com.learning.company.service.ICompanyService;

@RestController
@CrossOrigin
@RequestMapping({ "/employees" })
public class CompanyController {
	
    @Autowired
    private ICompanyService companyService;
	
	@GetMapping(produces = "application/json")
	public List<CompanyEntity> findAllCompany() {
		return companyService.findAllCompany();
	}

}
