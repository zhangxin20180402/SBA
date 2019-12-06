import { Component, OnInit } from '@angular/core';

import { Router } from '@angular/router';

@Component({
  selector: 'app-comparison-charts',
  templateUrl: './comparison-charts.component.html',
  styleUrls: ['./comparison-charts.component.css']
})
export class ComparisonChartsComponent implements OnInit {

  selectedCategory = "Company"
  selectedStockExchange = "BSE"

  categories:String[] = ["Company", "Sector"]; 
  stockExchanges:String[] = ["BSE", "NSE"]; 

  company = "Abc";

  constructor(private router: Router) { }

  ngOnInit() {
  }

  generateMap(){
    this.router.navigate(['admin/displayCharts'])
  }

}
