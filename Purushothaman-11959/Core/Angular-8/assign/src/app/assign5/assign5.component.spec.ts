import { ComponentFixture, TestBed } from '@angular/core/testing';

import { Assign5Component } from './assign5.component';

describe('Assign5Component', () => {
  let component: Assign5Component;
  let fixture: ComponentFixture<Assign5Component>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [Assign5Component]
    });
    fixture = TestBed.createComponent(Assign5Component);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
