import { TestBed } from '@angular/core/testing';

import { MuthuService } from './muthu.service';

describe('MuthuService', () => {
  let service: MuthuService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(MuthuService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
