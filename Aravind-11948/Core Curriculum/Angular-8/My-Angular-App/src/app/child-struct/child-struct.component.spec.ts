import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ChildStructComponent } from './child-struct.component';

describe('ChildStructComponent', () => {
  let component: ChildStructComponent;
  let fixture: ComponentFixture<ChildStructComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [ChildStructComponent]
    });
    fixture = TestBed.createComponent(ChildStructComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
