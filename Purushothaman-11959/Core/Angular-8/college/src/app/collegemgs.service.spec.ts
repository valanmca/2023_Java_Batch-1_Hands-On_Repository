import { TestBed } from '@angular/core/testing';

import { CollegemgsService } from './collegemgs.service';

describe('CollegemgsService', () => {
  let service: CollegemgsService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(CollegemgsService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
