import { ComponentFixture, TestBed } from '@angular/core/testing';

import { AssignOneComponent } from './assign-one.component';

describe('AssignOneComponent', () => {
  let component: AssignOneComponent;
  let fixture: ComponentFixture<AssignOneComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [AssignOneComponent]
    });
    fixture = TestBed.createComponent(AssignOneComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
