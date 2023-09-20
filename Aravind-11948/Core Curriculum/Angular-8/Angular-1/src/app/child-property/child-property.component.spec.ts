import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ChildPropertyComponent } from './child-property.component';

describe('ChildPropertyComponent', () => {
  let component: ChildPropertyComponent;
  let fixture: ComponentFixture<ChildPropertyComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [ChildPropertyComponent]
    });
    fixture = TestBed.createComponent(ChildPropertyComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
