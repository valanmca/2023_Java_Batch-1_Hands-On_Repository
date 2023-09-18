import { ComponentFixture, TestBed } from '@angular/core/testing';

import { FactorialTableExamplesComponent } from './factorial-table-examples.component';

describe('FactorialTableExamplesComponent', () => {
  let component: FactorialTableExamplesComponent;
  let fixture: ComponentFixture<FactorialTableExamplesComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [FactorialTableExamplesComponent]
    });
    fixture = TestBed.createComponent(FactorialTableExamplesComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
