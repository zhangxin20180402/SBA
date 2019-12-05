import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';

import { AdminComponent } from './admin/admin.component';
import { ImportExcelComponent} from './import-excel/import-excel.component';
import { ManageCompaniesComponent } from './manage-companies/manage-companies.component';
import { ManageStockExchangeComponent } from './manage-stock-exchange/manage-stock-exchange.component';
import { ManageIPOComponent } from './manage-ipo/manage-ipo.component';
import { UploadSummaryComponent } from './upload-summary/upload-summary.component';
import { AuthGaurdService } from '../service/auth-gaurd.service'

const adminRoutes:Routes = [
    { path: 'admin', 
      component: AdminComponent,
      canActivate:[AuthGaurdService],
      children:[
        {
            path: 'importData',
            component: ImportExcelComponent,
            canActivate:[AuthGaurdService]
        },
        {
            path: 'uploadSummary',
            component: UploadSummaryComponent,
            canActivate:[AuthGaurdService]
        },
        {
            path: 'company',
            component: ManageCompaniesComponent,
            canActivate:[AuthGaurdService]
        },
        {
            path: 'exchange',
            component: ManageStockExchangeComponent,
            canActivate:[AuthGaurdService]
        },
        {
            path: 'ipo',
            component: ManageIPOComponent,
            canActivate:[AuthGaurdService]
        },
        {
            path: '',
            component: ImportExcelComponent,
            canActivate:[AuthGaurdService]
        },
        {
            path: '**',
            component: ImportExcelComponent,
            canActivate:[AuthGaurdService]
        }, 
      ]
    },
];

@NgModule({
    imports: [RouterModule.forChild(adminRoutes)],
    exports: [RouterModule]
})

export class AdminRoutingModule{}