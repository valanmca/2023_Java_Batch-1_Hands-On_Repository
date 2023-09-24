import { TestBed } from '@angular/core/testing';

import { Muthu2Service } from './muthu2.service';

describe('Muthu2Service', () => {
  let service: Muthu2Service;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(Muthu2Service);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
