import { TestBed } from '@angular/core/testing';

import { TMSServiceService } from './tms-service.service';

describe('TMSServiceService', () => {
  let service: TMSServiceService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(TMSServiceService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
