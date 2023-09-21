import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ChildServicesComponent } from './child-services.component';

describe('ChildServicesComponent', () => {
  let component: ChildServicesComponent;
  let fixture: ComponentFixture<ChildServicesComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [ChildServicesComponent]
    });
    fixture = TestBed.createComponent(ChildServicesComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
