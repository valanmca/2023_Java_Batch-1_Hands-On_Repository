import { ComponentFixture, TestBed } from '@angular/core/testing';

import { Child2waybindingComponent } from './child2waybinding.component';

describe('Child2waybindingComponent', () => {
  let component: Child2waybindingComponent;
  let fixture: ComponentFixture<Child2waybindingComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [Child2waybindingComponent]
    });
    fixture = TestBed.createComponent(Child2waybindingComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
