import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { AppRoutingModule} from './app.routing.module';
import { HttpClientModule, HTTP_INTERCEPTORS } from '@angular/common/http';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';

import { AppComponent } from './app.component';
import { SignInComponent } from './common/sign-in/sign-in.component';
import { SignUpComponent } from './common/sign-up/sign-up.component';
import { UserComponent } from './user/user/user.component';

import { AdminModule} from './admin/admin.module';
import { JWTInterceptorService} from './service/jwtinterceptor.service';

// Import angular-fusioncharts
import { FusionChartsModule } from "angular-fusioncharts";

// Import FusionCharts library and chart modules
import * as FusionCharts from "fusioncharts";
import * as Charts from "fusioncharts/fusioncharts.charts";

import * as FusionTheme from "fusioncharts/themes/fusioncharts.theme.fusion";

// Pass the fusioncharts library and chart modules
FusionChartsModule.fcRoot(FusionCharts, Charts, FusionTheme);

@NgModule({
  declarations: [
    AppComponent,
    SignInComponent,
    SignUpComponent,
    UserComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule, 
    AdminModule,
    HttpClientModule,
    FormsModule,
    ReactiveFormsModule,
    FusionChartsModule
  ],
  providers: [  {  
    provide:HTTP_INTERCEPTORS, useClass:JWTInterceptorService, multi:true 
  }],
  bootstrap: [AppComponent]
})
export class AppModule { }
