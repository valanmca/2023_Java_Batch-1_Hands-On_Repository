import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ServicecalcComponent } from './servicecalc.component';

describe('ServicecalcComponent', () => {
  let component: ServicecalcComponent;
  let fixture: ComponentFixture<ServicecalcComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [ServicecalcComponent]
    });
    fixture = TestBed.createComponent(ServicecalcComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
