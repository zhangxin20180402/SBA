import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';

import { Company } from '../../models/company';
import { CompanyService } from '../../service/company.service';

@Component({
  selector: 'app-manage-companies',
  templateUrl: './manage-companies.component.html',
  styleUrls: ['./manage-companies.component.css']
})
export class ManageCompaniesComponent implements OnInit {

  companies: Company[];

  constructor(private companyService:CompanyService, private router: Router) { }

  ngOnInit() {
    this.getCompanies();
  }

  getCompanies(): void {

    this.companyService.getCompanies()
    .subscribe(companies => this.companies = companies);
  }

  newCompany() {
    this.router.navigate(['admin/createcompany'])
  }

  onEdit(company: Company): void {
    console.log(company);
  }

}
