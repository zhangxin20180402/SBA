import { NgModule } from '@angular/core';
import { RouterModule, Routes} from '@angular/router';

import { SignInComponent} from './common/sign-in/sign-in.component';
import { SignUpComponent} from './common/sign-up/sign-up.component';
import { UserComponent } from './user/user/user.component';

const myAppRoutes:Routes = [

    { path: '', redirectTo: 'sign-in', pathMatch: 'full' },
    { path: 'sign-in', component: SignInComponent },
    { path: 'sign-up', component: SignUpComponent },
    { path: 'user', component: UserComponent },    
  ];

  @NgModule({
    imports:  [RouterModule.forRoot(myAppRoutes)],
    exports: [RouterModule]
  })

  export class AppRoutingModule{}