import { ComponentFixture, TestBed } from '@angular/core/testing';

import { WayDataBindingComponenetsComponent } from './way-data-binding-componenets.component';

describe('WayDataBindingComponenetsComponent', () => {
  let component: WayDataBindingComponenetsComponent;
  let fixture: ComponentFixture<WayDataBindingComponenetsComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [WayDataBindingComponenetsComponent]
    });
    fixture = TestBed.createComponent(WayDataBindingComponenetsComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
