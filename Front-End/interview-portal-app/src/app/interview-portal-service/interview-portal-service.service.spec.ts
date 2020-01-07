import { TestBed } from '@angular/core/testing';

import { InterviewPortalServiceService } from './interview-portal-service.service';

describe('InterviewPortalServiceService', () => {
  beforeEach(() => TestBed.configureTestingModule({}));

  it('should be created', () => {
    const service: InterviewPortalServiceService = TestBed.get(InterviewPortalServiceService);
    expect(service).toBeTruthy();
  });
});
