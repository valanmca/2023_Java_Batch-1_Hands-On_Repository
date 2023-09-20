import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ChildPropertybindComponent } from './child-propertybind.component';

describe('ChildPropertybindComponent', () => {
  let component: ChildPropertybindComponent;
  let fixture: ComponentFixture<ChildPropertybindComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [ChildPropertybindComponent]
    });
    fixture = TestBed.createComponent(ChildPropertybindComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
