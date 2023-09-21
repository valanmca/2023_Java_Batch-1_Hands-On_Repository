import { ComponentFixture, TestBed } from '@angular/core/testing';

import { EventbindComponent } from './eventbind.component';

describe('EventbindComponent', () => {
  let component: EventbindComponent;
  let fixture: ComponentFixture<EventbindComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [EventbindComponent]
    });
    fixture = TestBed.createComponent(EventbindComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
