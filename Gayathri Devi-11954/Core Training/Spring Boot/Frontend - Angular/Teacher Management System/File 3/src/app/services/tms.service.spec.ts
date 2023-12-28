import { TestBed } from '@angular/core/testing';

import { TMSService } from './tms.service';

describe('TMSService', () => {
  let service: TMSService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(TMSService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
