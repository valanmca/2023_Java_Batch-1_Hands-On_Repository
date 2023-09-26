import { TestBed } from '@angular/core/testing';

import { MultiplyTablesService } from './multiply-tables.service';

describe('MultiplyTablesService', () => {
  let service: MultiplyTablesService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(MultiplyTablesService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
