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
    ReactiveFormsModule
  ],
  providers: [  {  
    provide:HTTP_INTERCEPTORS, useClass:JWTInterceptorService, multi:true 
  }],
  bootstrap: [AppComponent]
})
export class AppModule { }
