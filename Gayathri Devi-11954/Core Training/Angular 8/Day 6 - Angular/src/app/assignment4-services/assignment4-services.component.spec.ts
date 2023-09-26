import { ComponentFixture, TestBed } from '@angular/core/testing';

import { Assignment4ServicesComponent } from './assignment4-services.component';

describe('Assignment4ServicesComponent', () => {
  let component: Assignment4ServicesComponent;
  let fixture: ComponentFixture<Assignment4ServicesComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [Assignment4ServicesComponent]
    });
    fixture = TestBed.createComponent(Assignment4ServicesComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
