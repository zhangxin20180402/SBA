import { Component, OnInit } from '@angular/core';
import { UserDTO } from '../../models/user';
import {AuthenticationService} from '../../service/authentication.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-sign-up',
  templateUrl: './sign-up.component.html',
  styleUrls: ['./sign-up.component.css']
})
export class SignUpComponent implements OnInit {

  user:UserDTO = new UserDTO("","");

  constructor(private router: Router,private authenticationService: AuthenticationService) { }

  ngOnInit() {
  }

  registerUser(): void {
    this.authenticationService.registerUser(this.user)
        .subscribe( data => {
          alert("User created successfully.");
          this.router.navigate(['sign-in'])
        });
  };

}
