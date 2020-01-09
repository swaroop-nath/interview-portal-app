import { Component, OnInit } from '@angular/core';
import { Ask } from 'src/app/model/ask.model';
import { Interview } from 'src/app/model/interview.model';

@Component({
  selector: 'app-ask',
  templateUrl: './ask.component.html',
  styleUrls: ['./ask.component.css']
})
export class AskComponent implements OnInit {

  ask: Ask;
  inputChoice: number = 0;
  showFurtherStep: boolean = false;

  DEFAULT_INTERVIEW_LOCATION: string = 'Mumbai';

  interviewDetails: Interview[];
  singleInterviewDetail: Interview;

  possibleGrades: string[];

  constructor() { 
    this.ask = new Ask();
    this.interviewDetails = [new Interview(), new Interview(), new Interview()];
    this.singleInterviewDetail = new Interview();
    this.possibleGrades = ['B1', 'B2', 'C1', 'C2', 'D1', 'D2', 'E1', 'E2']
  }

  ngOnInit() {
  }

  showNextForOne(): void {
    this.singleInterviewDetail.interviewLocation = this.DEFAULT_INTERVIEW_LOCATION;
    this.ask.interviewDetails.push(this.singleInterviewDetail);
    this.ask.skill.skillName = this.ask.skill.skillName.toUpperCase();
    this.showFurtherStep = true;
  }

  showNextForTwo(): void {
    this.interviewDetails.forEach(detail => this.ask.interviewDetails.push(detail));
    this.ask.skill.skillName = this.ask.skill.skillName.toUpperCase();
    this.showFurtherStep = true;
  }

  raiseAskRequest(): void {
    console.log(this.ask);
    
  }

}
