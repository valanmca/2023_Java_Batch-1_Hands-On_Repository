import { ComponentFixture, TestBed } from '@angular/core/testing';

import { EventsbindingcomponentsComponent } from './eventsbindingcomponents.component';

describe('EventsbindingcomponentsComponent', () => {
  let component: EventsbindingcomponentsComponent;
  let fixture: ComponentFixture<EventsbindingcomponentsComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [EventsbindingcomponentsComponent]
    });
    fixture = TestBed.createComponent(EventsbindingcomponentsComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
