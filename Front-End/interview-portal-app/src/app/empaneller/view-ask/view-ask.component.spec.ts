import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { ViewAskComponent } from './view-ask.component';

describe('ViewAskComponent', () => {
  let component: ViewAskComponent;
  let fixture: ComponentFixture<ViewAskComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ ViewAskComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(ViewAskComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
