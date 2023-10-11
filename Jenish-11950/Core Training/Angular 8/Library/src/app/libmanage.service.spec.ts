import { TestBed } from '@angular/core/testing';

import { LibmanageService } from './libmanage.service';

describe('LibmanageService', () => {
  let service: LibmanageService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(LibmanageService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
