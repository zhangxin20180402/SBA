import { Component, OnInit } from '@angular/core';

import { Router } from '@angular/router';

import { CompanyService } from '../../service/company.service';

@Component({
  selector: 'app-create-company',
  templateUrl: './create-company.component.html',
  styleUrls: ['./create-company.component.css']
})
export class CreateCompanyComponent implements OnInit {

  companyName = "";
  ceo = "";
  turnover = "";
  brief = "";

  constructor(private companyService:CompanyService, private router: Router) { }

  ngOnInit() {

  }

  save() {
    fetch('/company/save', {
      method: 'post',
      headers: {
        'Accept': 'application/json',
        'Content-Type': 'application/json'
      },
      body: JSON.stringify({
        "companyName": this.companyName,
        "ceo": this.ceo,
        "turnover": this.turnover,
        "brief": this.brief
      })
    }).then(function (response) {
      this.router.navigate(['admin/company'])
    }.bind(this)).catch(function (ex) {
      console.log('parsing failed: ', ex)
    });
  }

}
