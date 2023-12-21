import { TestBed } from '@angular/core/testing';

import { DoctormanageService } from './doctormanage.service';

describe('DoctormanageService', () => {
  let service: DoctormanageService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(DoctormanageService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
