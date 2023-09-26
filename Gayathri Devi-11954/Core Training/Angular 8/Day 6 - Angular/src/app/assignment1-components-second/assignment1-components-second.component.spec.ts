import { ComponentFixture, TestBed } from '@angular/core/testing';

import { Assignment1COmponentsSecondComponent } from './assignment1-components-second.component';

describe('Assignment1COmponentsSecondComponent', () => {
  let component: Assignment1COmponentsSecondComponent;
  let fixture: ComponentFixture<Assignment1COmponentsSecondComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [Assignment1COmponentsSecondComponent]
    });
    fixture = TestBed.createComponent(Assignment1COmponentsSecondComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
