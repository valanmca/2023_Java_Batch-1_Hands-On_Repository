import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ChildDay21Component } from './child-day2.1.component';

describe('ChildDay21Component', () => {
  let component: ChildDay21Component;
  let fixture: ComponentFixture<ChildDay21Component>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [ChildDay21Component]
    });
    fixture = TestBed.createComponent(ChildDay21Component);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
