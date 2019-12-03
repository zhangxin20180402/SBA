import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';

import { AdminComponent } from './admin/admin.component';
import { ImportExcelComponent} from './import-excel/import-excel.component';
import { ManageCompaniesComponent } from './manage-companies/manage-companies.component';
import { ManageStockExchangeComponent } from './manage-stock-exchange/manage-stock-exchange.component';
import { ManageIPOComponent } from './manage-ipo/manage-ipo.component';

const adminRoutes:Routes = [
    { path: 'admin', 
      component: AdminComponent,
      children:[
        {
            path: 'importData',
            component: ImportExcelComponent
        },
        {
            path: 'company',
            component: ManageCompaniesComponent
        },
        {
            path: 'exchange',
            component: ManageStockExchangeComponent
        },
        {
            path: 'ipo',
            component: ManageIPOComponent
        },
        {
            path: '',
            component: ImportExcelComponent
        },
        {
            path: '**',
            component: ImportExcelComponent
        }, 
      ]
    },
];

@NgModule({
    imports: [RouterModule.forChild(adminRoutes)],
    exports: [RouterModule]
})

export class AdminRoutingModule{}