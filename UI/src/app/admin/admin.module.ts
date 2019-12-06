import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';

import { AdminComponent } from './admin/admin.component';
import { ImportExcelComponent} from './import-excel/import-excel.component';
import { ManageCompaniesComponent } from './manage-companies/manage-companies.component';
import { ManageStockExchangeComponent } from './manage-stock-exchange/manage-stock-exchange.component';
import { ManageIPOComponent } from './manage-ipo/manage-ipo.component';
import { AdminRoutingModule } from './admin.routing.module';
import { UploadSummaryComponent } from './upload-summary/upload-summary.component';
import { CreateCompanyComponent } from './create-company/create-company.component';
import { ComparisonChartsComponent } from './comparison-charts/comparison-charts.component';
import { DisplayChartsComponent } from './display-charts/display-charts.component';

@NgModule({
    imports: [BrowserModule, AdminRoutingModule,FormsModule,
        ReactiveFormsModule],
    declarations: [AdminComponent,
                   ImportExcelComponent,
                   ManageCompaniesComponent,
                   ManageStockExchangeComponent,
                   ManageIPOComponent,
                   UploadSummaryComponent,
                   CreateCompanyComponent,
                   ComparisonChartsComponent,
                   DisplayChartsComponent]
})

export class AdminModule{}