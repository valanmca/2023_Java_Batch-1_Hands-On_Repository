import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ValidationfromComponent } from './validationfrom.component';

describe('ValidationfromComponent', () => {
  let component: ValidationfromComponent;
  let fixture: ComponentFixture<ValidationfromComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [ValidationfromComponent]
    });
    fixture = TestBed.createComponent(ValidationfromComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
