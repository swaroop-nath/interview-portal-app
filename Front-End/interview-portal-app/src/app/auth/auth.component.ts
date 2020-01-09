import { Component, OnInit } from '@angular/core';
import { Login } from '../model/login.model';
import { InterviewPortalService } from '../interview-portal-service/interview-portal-service.service';
import { User } from '../model/user.model';
import { Role } from '../model/role.enum';
import { Router } from '@angular/router';

@Component({
  selector: 'app-auth',
  templateUrl: './auth.component.html',
  styleUrls: ['./auth.component.css']
})
export class AuthComponent implements OnInit {

  login: Login;
  showSignUp: boolean = false;
  signUp: User;
  possibleRoles: string[];
  selectedRole: string = '';

  constructor( private service: InterviewPortalService, private router: Router) { 
    this.login = new Login();
    this.signUp = new User();
    this.possibleRoles = ['Empaneller', 'Recruiter']
  }

  ngOnInit() {
  }

  loginUser(): void {
    this.service.loginUser(this.login).subscribe(jwToken => {
      this.service.setJWToken(jwToken);
      this.service.getUserDetails(jwToken).subscribe(user => {
        this.service.setCurrentUser(user);
        if (user.roles[0] == Role.ROLE_EMPANELLER)
          this.router.navigate(['/recruiter-ask'])
        else
          this.router.navigate(['/empaneller-view-ask'])
      });
    });
  }

  signUpUser(): void {
    if (this.selectedRole == this.possibleRoles[0])
      this.signUp.roles = [Role.ROLE_EMPANELLER]
    else
      this.signUp.roles = [Role.ROLE_RECRUITER]
    this.service.signUpUser(this.signUp).subscribe(jwToken => {
      this.service.setJWToken(jwToken);
      this.service.getUserDetails(jwToken).subscribe(user => {
        this.service.setCurrentUser(user);
        if (user.roles[0] == Role.ROLE_EMPANELLER)
          this.router.navigate(['/recruiter-ask'])
        else
          this.router.navigate(['/empaneller-view-ask'])
      });
    });
  }

  toggleSignUp(): void {
    this.showSignUp = !this.showSignUp;
  }
}
