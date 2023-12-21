import { TestBed } from '@angular/core/testing';

import { VechicleService } from './vechicle.service';

describe('VechicleService', () => {
  let service: VechicleService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(VechicleService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
