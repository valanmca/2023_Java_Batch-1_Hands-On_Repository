import { TestBed } from '@angular/core/testing';

import { MultiplyTableService } from './multiply-table.service';

describe('MultiplyTableService', () => {
  let service: MultiplyTableService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(MultiplyTableService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
