import { TestBed } from '@angular/core/testing';

import { MultiplicationtableService } from './multiplicationtable.service';

describe('MultiplicationtableService', () => {
  let service: MultiplicationtableService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(MultiplicationtableService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
