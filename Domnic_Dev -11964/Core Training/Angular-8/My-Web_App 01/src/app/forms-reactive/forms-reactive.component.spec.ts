import { ComponentFixture, TestBed } from '@angular/core/testing';

import { FormsReactiveComponent } from './forms-reactive.component';

describe('FormsReactiveComponent', () => {
  let component: FormsReactiveComponent;
  let fixture: ComponentFixture<FormsReactiveComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [FormsReactiveComponent]
    });
    fixture = TestBed.createComponent(FormsReactiveComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
