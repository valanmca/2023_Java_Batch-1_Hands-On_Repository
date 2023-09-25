import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ServiceCalculatorComponent } from './service-calculator.component';

describe('ServiceCalculatorComponent', () => {
  let component: ServiceCalculatorComponent;
  let fixture: ComponentFixture<ServiceCalculatorComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [ServiceCalculatorComponent]
    });
    fixture = TestBed.createComponent(ServiceCalculatorComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
