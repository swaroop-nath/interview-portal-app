import { Component, OnInit } from '@angular/core';
import { InterviewPortalService } from 'src/app/interview-portal-service/interview-portal-service.service';
import { Ask } from 'src/app/model/ask.model';

@Component({
  selector: 'app-view-ask',
  templateUrl: './view-ask.component.html',
  styleUrls: ['./view-ask.component.css']
})
export class ViewAskComponent implements OnInit {

  askView: Ask[] = [];
  dateQuery: Date;
  locations: string[];

  constructor(private service: InterviewPortalService) { 
    this.askView = [];
    this.dateQuery = new Date();
    this.locations = []
  }

  ngOnInit() {
    this.service.loadAsks(this.service.getJWToken()).subscribe(asks => {
      this.service.loadedAsks = asks;
      asks.forEach(ask => this.askView.push(ask));
      this.storeLoactions();
    });
  }

  storeLoactions(): void {
    this.askView.forEach(ask => {
      let locs = '';
      ask.interviewDetails.forEach(detail => {
        if (detail.interviewLocation != '')
          locs += detail.interviewLocation + ', ';
      });
      this.locations.push(locs);
    });
  }

  searchAsks(): void {
    console.log(new Date().getHours() - this.dateQuery.getHours()); // This gives 0, use this
    
    this.askView = []
    this.service.loadedAsks.forEach(ask => {
      if (ask.interviewDate == this.dateQuery)
        this.askView.push(ask);
    });
    this.storeLoactions();
  }

}
