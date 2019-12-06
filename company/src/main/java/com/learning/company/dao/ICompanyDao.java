package com.learning.company.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.learning.company.entity.CompanyEntity;

@Repository
public interface ICompanyDao extends JpaRepository<CompanyEntity, Long> {

}
