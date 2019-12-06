package com.learning.company.entity;

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
@Table(name = "company")
public class CompanyEntity {
	
	@Id
	@GeneratedValue(strategy= GenerationType.AUTO,generator="native")
	@GenericGenerator(name = "native",strategy = "native")
    private Long id;
	
	@Column(name = "name")
	private String name;
	
	@Column(name = "turnover")
	private String turnover;
	
	@Column(name="ceo")
	private String ceo;
	
	@Column(name="boardofdirectors")
	private String boardOfDirectors;

    @OneToMany(mappedBy = "company", cascade = CascadeType.ALL)
    private Set<CompanyStockExchange> companyStockExchanges;
    
	@Column(name="sector")
	private String sector;
    
	@Column(name="briefwriteup")
	private String briefwriteup;

	public CompanyEntity() {
		super();
	}

	public CompanyEntity(String name, String turnover, String ceo, String briefwriteup) {
		super();
		this.name = name;
		this.turnover = turnover;
		this.ceo = ceo;
		this.briefwriteup = briefwriteup;
	}

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

	public String getTurnover() {
		return turnover;
	}

	public void setTurnover(String turnover) {
		this.turnover = turnover;
	}

	public String getCeo() {
		return ceo;
	}

	public void setCeo(String ceo) {
		this.ceo = ceo;
	}

	public String getBoardOfDirectors() {
		return boardOfDirectors;
	}

	public void setBoardOfDirectors(String boardOfDirectors) {
		this.boardOfDirectors = boardOfDirectors;
	}

	public Set<CompanyStockExchange> getCompanyStockExchanges() {
		return companyStockExchanges;
	}

	public void setCompanyStockExchanges(Set<CompanyStockExchange> companyStockExchanges) {
		this.companyStockExchanges = companyStockExchanges;
	}

	public String getSector() {
		return sector;
	}

	public void setSector(String sector) {
		this.sector = sector;
	}

	public String getBriefwriteup() {
		return briefwriteup;
	}

	public void setBriefwriteup(String briefwriteup) {
		this.briefwriteup = briefwriteup;
	}

}
