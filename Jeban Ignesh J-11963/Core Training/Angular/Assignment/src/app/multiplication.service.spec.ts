import { TestBed } from '@angular/core/testing';

import { MultiplicationService } from './multiplication.service';

describe('MultiplicationService', () => {
  let service: MultiplicationService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(MultiplicationService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
