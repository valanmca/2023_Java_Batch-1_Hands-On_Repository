import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ChildAttributeComponent } from './child-attribute.component';

describe('ChildAttributeComponent', () => {
  let component: ChildAttributeComponent;
  let fixture: ComponentFixture<ChildAttributeComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [ChildAttributeComponent]
    });
    fixture = TestBed.createComponent(ChildAttributeComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
