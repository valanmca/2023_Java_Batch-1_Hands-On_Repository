import { ComponentFixture, TestBed } from '@angular/core/testing';

import { Assignment1COmponentsThirdComponent } from './assignment1-components-third.component';

describe('Assignment1COmponentsThirdComponent', () => {
  let component: Assignment1COmponentsThirdComponent;
  let fixture: ComponentFixture<Assignment1COmponentsThirdComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [Assignment1COmponentsThirdComponent]
    });
    fixture = TestBed.createComponent(Assignment1COmponentsThirdComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
