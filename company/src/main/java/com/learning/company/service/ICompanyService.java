package com.learning.company.service;

import java.util.List;

import com.learning.company.entity.CompanyEntity;
import com.learning.company.model.Company;

public interface ICompanyService {

	List<CompanyEntity> findAllCompany();

	void save(Company company);

}
