import { TestBed } from '@angular/core/testing';

import { TeachermngService } from './teachermng.service';

describe('TeachermngService', () => {
  let service: TeachermngService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(TeachermngService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
