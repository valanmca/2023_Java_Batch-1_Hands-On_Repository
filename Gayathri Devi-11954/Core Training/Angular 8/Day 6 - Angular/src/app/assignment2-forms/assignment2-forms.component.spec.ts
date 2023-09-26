import { ComponentFixture, TestBed } from '@angular/core/testing';

import { Assignment2FormsComponent } from './assignment2-forms.component';

describe('Assignment2FormsComponent', () => {
  let component: Assignment2FormsComponent;
  let fixture: ComponentFixture<Assignment2FormsComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [Assignment2FormsComponent]
    });
    fixture = TestBed.createComponent(Assignment2FormsComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
