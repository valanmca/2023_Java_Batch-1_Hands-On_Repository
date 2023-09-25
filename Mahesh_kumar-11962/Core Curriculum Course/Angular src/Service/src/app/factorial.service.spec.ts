import { TestBed } from '@angular/core/testing';

import { FactorialService } from './factorial.service';

describe('FactorialService', () => {
  let service: FactorialService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(FactorialService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
