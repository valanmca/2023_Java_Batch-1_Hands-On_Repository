import { ComponentFixture, TestBed } from '@angular/core/testing';

import { Q4Component } from './q4.component';

describe('Q4Component', () => {
  let component: Q4Component;
  let fixture: ComponentFixture<Q4Component>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [Q4Component]
    });
    fixture = TestBed.createComponent(Q4Component);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
