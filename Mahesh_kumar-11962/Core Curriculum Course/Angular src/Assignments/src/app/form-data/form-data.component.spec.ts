import { ComponentFixture, TestBed } from '@angular/core/testing';

import { FormDataComponent } from './form-data.component';

describe('FormDataComponent', () => {
  let component: FormDataComponent;
  let fixture: ComponentFixture<FormDataComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [FormDataComponent]
    });
    fixture = TestBed.createComponent(FormDataComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
