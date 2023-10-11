import { ComponentFixture, TestBed } from '@angular/core/testing';

import { BuybookComponent } from './buybook.component';

describe('BuybookComponent', () => {
  let component: BuybookComponent;
  let fixture: ComponentFixture<BuybookComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [BuybookComponent]
    });
    fixture = TestBed.createComponent(BuybookComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
