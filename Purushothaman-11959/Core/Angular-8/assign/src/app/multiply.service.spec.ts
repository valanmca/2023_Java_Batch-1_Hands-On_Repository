import { TestBed } from '@angular/core/testing';

import { MultiplyService } from './multiply.service';

describe('MultiplyService', () => {
  let service: MultiplyService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(MultiplyService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
