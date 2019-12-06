package com.learning.company.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.learning.company.dao.ICompanyDao;
import com.learning.company.entity.CompanyEntity;
import com.learning.company.model.Company;
import com.learning.company.service.ICompanyService;

@Service
public class CompanyServiceImpl implements ICompanyService{
	
    @Autowired 
    private ICompanyDao companyDao;

	@Override
	public List<CompanyEntity> findAllCompany() {
		return companyDao.findAll();
	}

	@Override
	public void save(Company company) {
		companyDao.save(new CompanyEntity(company.getCompanyName(), company.getCeo(), company.getTurnover(), company.getBrief()));
	}

}
