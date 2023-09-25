import { ComponentFixture, TestBed } from '@angular/core/testing';

import { AssignFactComponent } from './assign-fact.component';

describe('AssignFactComponent', () => {
  let component: AssignFactComponent;
  let fixture: ComponentFixture<AssignFactComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [AssignFactComponent]
    });
    fixture = TestBed.createComponent(AssignFactComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
