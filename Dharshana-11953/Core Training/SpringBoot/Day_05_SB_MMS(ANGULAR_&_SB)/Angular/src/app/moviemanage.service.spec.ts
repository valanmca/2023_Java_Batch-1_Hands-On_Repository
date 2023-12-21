import { TestBed } from '@angular/core/testing';

import { MoviemanageService } from './moviemanage.service';

describe('MoviemanageService', () => {
  let service: MoviemanageService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(MoviemanageService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
