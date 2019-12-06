package com.learning.company.entity;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
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
	
    @OneToMany(mappedBy = "stockexchange", cascade = CascadeType.ALL)
    private Set<CompanyStockExchange> companyStockExchanges = new HashSet<>();

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

	public Set<CompanyStockExchange> getCompanyStockExchanges() {
		return companyStockExchanges;
	}

	public void setCompanyStockExchanges(Set<CompanyStockExchange> companyStockExchanges) {
		this.companyStockExchanges = companyStockExchanges;
	}

}
