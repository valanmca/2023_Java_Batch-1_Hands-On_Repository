import { TestBed } from '@angular/core/testing';

import { SclmgsService } from './sclmgs.service';

describe('SclmgsService', () => {
  let service: SclmgsService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(SclmgsService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
