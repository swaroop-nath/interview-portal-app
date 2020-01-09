import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { AuthComponent } from '../auth/auth.component';
import { AskComponent } from '../recruiter/ask/ask.component';
import { ViewAskComponent } from '../empaneller/view-ask/view-ask.component';

const routes: Routes = [
  {
    path: '', 
    component: AuthComponent
  },
  {
    path: 'recruiter-ask',
    component: AskComponent
  },
  {
    path: 'empaneller-view-ask',
    component: ViewAskComponent
  }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class NavigatorRoutingModule { }
