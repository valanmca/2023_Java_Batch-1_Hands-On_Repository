import { TestBed } from '@angular/core/testing';

import { RajService } from './raj.service';

describe('RajService', () => {
  let service: RajService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(RajService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
