import { ComponentFixture, TestBed } from '@angular/core/testing';

import { Child4Component } from './child4.component';

describe('Child4Component', () => {
  let component: Child4Component;
  let fixture: ComponentFixture<Child4Component>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [Child4Component]
    });
    fixture = TestBed.createComponent(Child4Component);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
