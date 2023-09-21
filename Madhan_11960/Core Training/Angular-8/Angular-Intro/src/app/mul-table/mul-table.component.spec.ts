import { ComponentFixture, TestBed } from '@angular/core/testing';

import { MulTableComponent } from './mul-table.component';

describe('MulTableComponent', () => {
  let component: MulTableComponent;
  let fixture: ComponentFixture<MulTableComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [MulTableComponent]
    });
    fixture = TestBed.createComponent(MulTableComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
