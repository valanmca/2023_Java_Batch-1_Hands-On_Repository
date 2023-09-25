import { ComponentFixture, TestBed } from '@angular/core/testing';

import { Q2Component } from './q2.component';

describe('Q2Component', () => {
  let component: Q2Component;
  let fixture: ComponentFixture<Q2Component>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [Q2Component]
    });
    fixture = TestBed.createComponent(Q2Component);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
