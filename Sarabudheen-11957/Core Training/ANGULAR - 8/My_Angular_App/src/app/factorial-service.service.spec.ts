import { TestBed } from '@angular/core/testing';

import { FactorialServiceService } from './factorial-service.service';

describe('FactorialServiceService', () => {
  let service: FactorialServiceService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(FactorialServiceService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
