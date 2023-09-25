import { ComponentFixture, TestBed } from '@angular/core/testing';

import { OnewayDatabindingComponent } from './oneway-databinding.component';

describe('OnewayDatabindingComponent', () => {
  let component: OnewayDatabindingComponent;
  let fixture: ComponentFixture<OnewayDatabindingComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [OnewayDatabindingComponent]
    });
    fixture = TestBed.createComponent(OnewayDatabindingComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
