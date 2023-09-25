import { ComponentFixture, TestBed } from '@angular/core/testing';

import { Child51Component } from './child51.component';

describe('Child51Component', () => {
  let component: Child51Component;
  let fixture: ComponentFixture<Child51Component>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [Child51Component]
    });
    fixture = TestBed.createComponent(Child51Component);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
