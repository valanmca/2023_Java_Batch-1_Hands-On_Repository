import { ComponentFixture, TestBed } from '@angular/core/testing';

import { RajComponent } from './raj.component';

describe('RajComponent', () => {
  let component: RajComponent;
  let fixture: ComponentFixture<RajComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [RajComponent]
    });
    fixture = TestBed.createComponent(RajComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
