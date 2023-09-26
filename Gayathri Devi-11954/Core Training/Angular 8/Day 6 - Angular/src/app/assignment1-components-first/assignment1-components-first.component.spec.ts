import { ComponentFixture, TestBed } from '@angular/core/testing';

import { Assignment1COmponentsFirstComponent } from './assignment1-components-first.component';

describe('Assignment1COmponentsFirstComponent', () => {
  let component: Assignment1COmponentsFirstComponent;
  let fixture: ComponentFixture<Assignment1COmponentsFirstComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [Assignment1COmponentsFirstComponent]
    });
    fixture = TestBed.createComponent(Assignment1COmponentsFirstComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
