import { Component, OnInit} from '@angular/core';
import { StockExchange } from '../../models/stockExchange';

import { StockExchangeService } from '../../service/stock-exchange.service';

@Component({
  selector: 'app-manage-stock-exchange',
  templateUrl: './manage-stock-exchange.component.html',
  styleUrls: ['./manage-stock-exchange.component.css']
})
export class ManageStockExchangeComponent implements OnInit {

  stockExchanges: StockExchange[];

  constructor(private stockExchangeService:StockExchangeService) { }

  ngOnInit() {
    this.getStockExchanges();
  }

  getStockExchanges(): void {
    this.stockExchangeService.getStockExchanges()
    .subscribe(stockExchanges => {
      
      this.stockExchanges = stockExchanges
      console.log(this.stockExchanges);
    });
  }

  newStockExchange() {
  }

  onEdit(stockExchange: StockExchange): void {
    console.log(stockExchange);
  }

}
