import { TestBed } from '@angular/core/testing';

import { ServicetmsService } from './servicetms.service';

describe('ServicetmsService', () => {
  let service: ServicetmsService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(ServicetmsService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
