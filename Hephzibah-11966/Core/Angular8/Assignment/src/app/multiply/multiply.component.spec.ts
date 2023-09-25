import { ComponentFixture, TestBed } from '@angular/core/testing';

import { MultiplyComponent } from './multiply.component';

describe('MultiplyComponent', () => {
  let component: MultiplyComponent;
  let fixture: ComponentFixture<MultiplyComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [MultiplyComponent]
    });
    fixture = TestBed.createComponent(MultiplyComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
