import { ComponentFixture, TestBed } from '@angular/core/testing';

import { Child7Component } from './child7.component';

describe('Child7Component', () => {
  let component: Child7Component;
  let fixture: ComponentFixture<Child7Component>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [Child7Component]
    });
    fixture = TestBed.createComponent(Child7Component);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
