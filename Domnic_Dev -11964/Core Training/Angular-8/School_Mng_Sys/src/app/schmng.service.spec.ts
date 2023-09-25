import { TestBed } from '@angular/core/testing';

import { SchmngService } from './schmng.service';

describe('SchmngService', () => {
  let service: SchmngService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(SchmngService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
