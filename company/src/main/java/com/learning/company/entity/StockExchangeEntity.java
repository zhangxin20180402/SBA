package com.learning.company.entity;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name="stockexchange")
public class StockExchangeEntity {
	
	@Id
	@GeneratedValue(strategy= GenerationType.AUTO,generator="native")
	@GenericGenerator(name = "native",strategy = "native")
    private Long id;
	
	@Column(name = "name")
	private String name;
	
	@Column(name = "brief")
	private String brief;
	
	@Column(name = "contactaddress")
	private String contactAddress;
	
	@Column(name = "remark")
	private String remark;
	
    @ManyToMany(mappedBy = "stockExchangeSet")
    private Set<CompanyEntity> companySet;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBrief() {
		return brief;
	}

	public void setBrief(String brief) {
		this.brief = brief;
	}

	public String getContactAddress() {
		return contactAddress;
	}

	public void setContactAddress(String contactAddress) {
		this.contactAddress = contactAddress;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public Set<CompanyEntity> getCompanySet() {
		return companySet;
	}

	public void setCompanySet(Set<CompanyEntity> companySet) {
		this.companySet = companySet;
	}

}
