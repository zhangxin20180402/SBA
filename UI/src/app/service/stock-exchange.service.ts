import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';

import { Observable, of } from 'rxjs';
import { catchError} from 'rxjs/operators';

import { StockExchange } from '../models/stockExchange';

@Injectable({
  providedIn: 'root'
})
export class StockExchangeService {

  constructor(private http: HttpClient) { }

  getStockExchanges(): Observable<StockExchange[]> {

    const searchUrl = "/stockExchange/findAll";

    return this.http.get<StockExchange[]>(searchUrl)
      .pipe(
        catchError(this.handleError<StockExchange[]>('getStockExchanges', []))
      );
  }

  private handleError<T>(operation = 'operation', result?: T) {
    return (error: any): Observable<T> => {
      console.error(error);
      return of(result as T);
    };
  }

}
