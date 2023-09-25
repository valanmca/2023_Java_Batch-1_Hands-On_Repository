import { ComponentFixture, TestBed } from '@angular/core/testing';

import { TwowayDataBindingComponent } from './twoway-data-binding.component';

describe('TwowayDataBindingComponent', () => {
  let component: TwowayDataBindingComponent;
  let fixture: ComponentFixture<TwowayDataBindingComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [TwowayDataBindingComponent]
    });
    fixture = TestBed.createComponent(TwowayDataBindingComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
