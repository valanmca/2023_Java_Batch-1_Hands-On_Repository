import { ComponentFixture, TestBed } from '@angular/core/testing';

import { FormstdfComponent } from './formstdf.component';

describe('FormstdfComponent', () => {
  let component: FormstdfComponent;
  let fixture: ComponentFixture<FormstdfComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [FormstdfComponent]
    });
    fixture = TestBed.createComponent(FormstdfComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
