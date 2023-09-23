import { ComponentFixture, TestBed } from '@angular/core/testing';

import { PropertyBindingComponentsComponent } from './property-binding-components.component';

describe('PropertyBindingComponentsComponent', () => {
  let component: PropertyBindingComponentsComponent;
  let fixture: ComponentFixture<PropertyBindingComponentsComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [PropertyBindingComponentsComponent]
    });
    fixture = TestBed.createComponent(PropertyBindingComponentsComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
