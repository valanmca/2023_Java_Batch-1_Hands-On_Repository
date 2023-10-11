import { ComponentFixture, TestBed } from '@angular/core/testing';

import { Assign2Component } from './assign2.component';

describe('Assign2Component', () => {
  let component: Assign2Component;
  let fixture: ComponentFixture<Assign2Component>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [Assign2Component]
    });
    fixture = TestBed.createComponent(Assign2Component);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
