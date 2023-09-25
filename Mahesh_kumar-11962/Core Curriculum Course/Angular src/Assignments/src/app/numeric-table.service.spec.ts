import { TestBed } from '@angular/core/testing';

import { NumericTableService } from './numeric-table.service';

describe('NumericTableService', () => {
  let service: NumericTableService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(NumericTableService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
