import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ChildEventComponent } from './child-event.component';

describe('ChildEventComponent', () => {
  let component: ChildEventComponent;
  let fixture: ComponentFixture<ChildEventComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [ChildEventComponent]
    });
    fixture = TestBed.createComponent(ChildEventComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
