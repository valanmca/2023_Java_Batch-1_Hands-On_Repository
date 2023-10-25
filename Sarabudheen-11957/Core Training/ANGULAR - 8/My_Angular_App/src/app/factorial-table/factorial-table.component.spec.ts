import { ComponentFixture, TestBed } from '@angular/core/testing';

import { FactorialTableComponent } from './factorial-table.component';

describe('FactorialTableComponent', () => {
  let component: FactorialTableComponent;
  let fixture: ComponentFixture<FactorialTableComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [FactorialTableComponent]
    });
    fixture = TestBed.createComponent(FactorialTableComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
