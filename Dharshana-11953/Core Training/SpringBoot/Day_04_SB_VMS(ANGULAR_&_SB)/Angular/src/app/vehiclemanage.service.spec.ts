import { TestBed } from '@angular/core/testing';

import { VehiclemanageService } from './vehiclemanage.service';

describe('VehiclemanageService', () => {
  let service: VehiclemanageService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(VehiclemanageService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
