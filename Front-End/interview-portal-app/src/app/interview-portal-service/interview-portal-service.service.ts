import { Injectable } from '@angular/core';
import { Login } from '../model/login.model';
import { Observable } from 'rxjs';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { User } from '../model/user.model';

@Injectable({
  providedIn: 'root'
})
export class InterviewPortalService {

  private LOGIN_URL = "http://localhost:8180/auth-api/authenticate";
  private SIGN_UP_URL = "http://localhost:8180/auth-api/sign-up";
  private GET_USER_URL = "http://localhost:8180/auth-api/get-user";

  private currentUser: User = null;

  constructor(private connection: HttpClient) { }

  loginUser(loginBean: Login): Observable<string> {
    return this.connection.post<string>(this.LOGIN_URL, loginBean, {responseType : 'text' as 'json'});
  }

  signUpUser(newUser: User): Observable<string> {
    return this.connection.post<string>(this.SIGN_UP_URL, newUser, {responseType: 'text' as 'json'});
  }

  getUserDetails(token: string): Observable<User> {
    let options = {
      headers: {
        'Authorization': token
      }
    }
    return this.connection.get<User>(this.GET_USER_URL, options);
  }

  setJWToken(token: string): void {
    sessionStorage.setItem('token', token);
  }

  getJWToken(): string {
    return sessionStorage.getItem('token');
  }

  setCurrentUser(user: User): void {
    this.currentUser = user;
  }

  getCurrentUser(): User {
    return this.currentUser;
  }

  invalidateSession(): void {
    sessionStorage.removeItem('token');
    this.currentUser = null;
  }
}
