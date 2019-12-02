import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { AppRoutingModule} from './app.routing.module';

import { AppComponent } from './app.component';
import { ImportExcelComponent } from './import-excel/import-excel.component';
import { ManageCompaniesComponent } from './manage-companies/manage-companies.component';
import { ManageIPOComponent } from './manage-ipo/manage-ipo.component';
import { ManageStockExchangeComponent } from './manage-stock-exchange/manage-stock-exchange.component';

@NgModule({
  declarations: [
    AppComponent,
    ImportExcelComponent,
    ManageCompaniesComponent,
    ManageIPOComponent,
    ManageStockExchangeComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
