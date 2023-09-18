import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ServicescallingconstructorComponent } from './servicescallingconstructor.component';

describe('ServicescallingconstructorComponent', () => {
  let component: ServicescallingconstructorComponent;
  let fixture: ComponentFixture<ServicescallingconstructorComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [ServicescallingconstructorComponent]
    });
    fixture = TestBed.createComponent(ServicescallingconstructorComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
