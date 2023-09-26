import { ComponentFixture, TestBed } from '@angular/core/testing';

import { Assignment3DIrectivesComponent } from './assignment3-directives.component';

describe('Assignment3DIrectivesComponent', () => {
  let component: Assignment3DIrectivesComponent;
  let fixture: ComponentFixture<Assignment3DIrectivesComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [Assignment3DIrectivesComponent]
    });
    fixture = TestBed.createComponent(Assignment3DIrectivesComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
