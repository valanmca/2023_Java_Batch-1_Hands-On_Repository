import { ComponentFixture, TestBed } from '@angular/core/testing';

import { FormsTDFComponent } from './forms-tdf.component';

describe('FormsTDFComponent', () => {
  let component: FormsTDFComponent;
  let fixture: ComponentFixture<FormsTDFComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [FormsTDFComponent]
    });
    fixture = TestBed.createComponent(FormsTDFComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
