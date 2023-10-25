import { ComponentFixture, TestBed } from '@angular/core/testing';

import { IgneshComponent } from './ignesh.component';

describe('IgneshComponent', () => {
  let component: IgneshComponent;
  let fixture: ComponentFixture<IgneshComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [IgneshComponent]
    });
    fixture = TestBed.createComponent(IgneshComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
