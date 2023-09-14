import { ComponentFixture, TestBed } from '@angular/core/testing';

import ChildDay2Component from './child-day2.component';

describe('ChildDay2Component', () => {
  let component: ChildDay2Component;
  let fixture: ComponentFixture<ChildDay2Component>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [ChildDay2Component]
    });
    fixture = TestBed.createComponent(ChildDay2Component);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
