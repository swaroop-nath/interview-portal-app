import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppComponent } from './app.component';
import { AuthComponent } from './auth/auth.component';
import { NavigatorRoutingModule } from './navigator/navigator-routing.module';
import { FormsModule } from '@angular/forms';
import { HttpClientModule } from '@angular/common/http';
import { AskComponent } from './recruiter/ask/ask.component';
import { ViewAskComponent } from './empaneller/view-ask/view-ask.component';

@NgModule({
  declarations: [
    AppComponent,
    AuthComponent,
    AskComponent,
    ViewAskComponent
  ],
  imports: [
    BrowserModule,
    NavigatorRoutingModule,
    FormsModule,
    HttpClientModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
