import { TestBed } from '@angular/core/testing';

import { FactorailService } from './factorail.service';

describe('FactorailService', () => {
  let service: FactorailService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(FactorailService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
