import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AdminComponent } from './admin/admin.component';
import { ImportExcelComponent} from './import-excel/import-excel.component';
import { ManageCompaniesComponent } from './manage-companies/manage-companies.component';
import { ManageStockExchangeComponent } from './manage-stock-exchange/manage-stock-exchange.component';
import { ManageIPOComponent } from './manage-ipo/manage-ipo.component';
import { AdminRoutingModule } from './admin.routing.module';

@NgModule({
    imports: [BrowserModule, AdminRoutingModule],
    declarations: [AdminComponent,ImportExcelComponent,ManageCompaniesComponent,ManageStockExchangeComponent,ManageIPOComponent]
})

export class AdminModule{}