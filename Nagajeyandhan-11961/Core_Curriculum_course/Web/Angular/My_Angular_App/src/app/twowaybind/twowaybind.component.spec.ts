import { ComponentFixture, TestBed } from '@angular/core/testing';

import { TwowaybindComponent } from './twowaybind.component';

describe('TwowaybindComponent', () => {
  let component: TwowaybindComponent;
  let fixture: ComponentFixture<TwowaybindComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [TwowaybindComponent]
    });
    fixture = TestBed.createComponent(TwowaybindComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
