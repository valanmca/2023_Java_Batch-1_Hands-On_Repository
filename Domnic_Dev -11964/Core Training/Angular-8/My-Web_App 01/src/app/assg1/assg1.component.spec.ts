import { ComponentFixture, TestBed } from '@angular/core/testing';

import { Assg1Component } from './assg1.component';

describe('Assg1Component', () => {
  let component: Assg1Component;
  let fixture: ComponentFixture<Assg1Component>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [Assg1Component]
    });
    fixture = TestBed.createComponent(Assg1Component);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
