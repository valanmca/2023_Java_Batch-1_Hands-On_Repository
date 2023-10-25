import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ChildInterpolationComponent } from './child-interpolation.component';

describe('ChildInterpolationComponent', () => {
  let component: ChildInterpolationComponent;
  let fixture: ComponentFixture<ChildInterpolationComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [ChildInterpolationComponent]
    });
    fixture = TestBed.createComponent(ChildInterpolationComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
