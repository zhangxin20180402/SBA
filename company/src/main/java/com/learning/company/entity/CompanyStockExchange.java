package com.learning.company.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "companystockexchange")
public class CompanyStockExchange implements Serializable {
	
	private static final long serialVersionUID = 3095573564232538140L;	
	
    @Id
    @ManyToOne
    @JoinColumn(name = "company_id",nullable = false)
    private CompanyEntity company;

    @Id
    @ManyToOne
    @JoinColumn(name = "stockexchange_id",nullable = false)
    private StockExchangeEntity stockexchange;
    
    @Column(name = "companystockcode")
    private String companyStockCode;

	public CompanyEntity getCompany() {
		return company;
	}

	public void setCompany(CompanyEntity company) {
		this.company = company;
	}

	public StockExchangeEntity getStockexchange() {
		return stockexchange;
	}

	public void setStockexchange(StockExchangeEntity stockexchange) {
		this.stockexchange = stockexchange;
	}

	public String getCompanyStockCode() {
		return companyStockCode;
	}

	public void setCompanyStockCode(String companyStockCode) {
		this.companyStockCode = companyStockCode;
	}
    
}
