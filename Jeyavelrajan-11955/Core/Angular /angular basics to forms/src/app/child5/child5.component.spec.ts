import { ComponentFixture, TestBed } from '@angular/core/testing';

import { Child5Component } from './child5.component';

describe('Child5Component', () => {
  let component: Child5Component;
  let fixture: ComponentFixture<Child5Component>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [Child5Component]
    });
    fixture = TestBed.createComponent(Child5Component);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
