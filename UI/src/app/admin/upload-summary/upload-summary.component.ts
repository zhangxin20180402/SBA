import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';

@Component({
  selector: 'app-upload-summary',
  templateUrl: './upload-summary.component.html',
  styleUrls: ['./upload-summary.component.css']
})
export class UploadSummaryComponent implements OnInit {

  companyName = "";
  stockExchange = "";
  nrOfRecords = "";
  fromDate="";
  toDate="";

  constructor(private router: Router) { 

    const state = JSON.parse(this.router.getCurrentNavigation().extras.state);

    this.companyName = state.companyName
    this.stockExchange = state.stockExchange
    this.nrOfRecords = state.numberOfRecords
    this.fromDate = state.fromDate
    this.toDate = state.toDate

  }

  ngOnInit() {
  }

  ok() {
    this.router.navigate(['admin/importData'])
  }

}
