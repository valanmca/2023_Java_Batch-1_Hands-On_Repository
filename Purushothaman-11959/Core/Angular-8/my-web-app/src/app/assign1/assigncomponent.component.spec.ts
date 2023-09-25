import { ComponentFixture, TestBed } from '@angular/core/testing';

import { AssigncomponentComponent } from './assigncomponent.component';

describe('AssigncomponentComponent', () => {
  let component: AssigncomponentComponent;
  let fixture: ComponentFixture<AssigncomponentComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [AssigncomponentComponent]
    });
    fixture = TestBed.createComponent(AssigncomponentComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
