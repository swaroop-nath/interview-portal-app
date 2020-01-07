import { Component, OnInit } from '@angular/core';
import { Login } from '../model/login';
import { InterviewPortalService } from '../interview-portal-service/interview-portal-service.service';

@Component({
  selector: 'app-auth',
  templateUrl: './auth.component.html',
  styleUrls: ['./auth.component.css']
})
export class AuthComponent implements OnInit {

  login: Login;

  constructor( private service: InterviewPortalService) { 
    this.login = new Login();
  }

  ngOnInit() {
  }

  loginUser(): void {
    this.service.loginUser(this.login).subscribe(jwToken => {
      this.service.setJWToken(jwToken);
      console.log(jwToken);
      
      this.service.getUserDetails(jwToken).subscribe(user => this.service.setCurrentUser(user));
    });
  }
}
