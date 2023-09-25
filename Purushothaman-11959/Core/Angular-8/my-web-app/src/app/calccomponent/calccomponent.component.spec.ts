import { ComponentFixture, TestBed } from '@angular/core/testing';

import { CalccomponentComponent } from './calccomponent.component';

describe('CalccomponentComponent', () => {
  let component: CalccomponentComponent;
  let fixture: ComponentFixture<CalccomponentComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [CalccomponentComponent]
    });
    fixture = TestBed.createComponent(CalccomponentComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
