import { ComponentFixture, TestBed } from '@angular/core/testing';

import { FactorialComponent } from './factorial.component';

describe('FactorialComponent', () => {
  let component: FactorialComponent;
  let fixture: ComponentFixture<FactorialComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [FactorialComponent]
    });
    fixture = TestBed.createComponent(FactorialComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
