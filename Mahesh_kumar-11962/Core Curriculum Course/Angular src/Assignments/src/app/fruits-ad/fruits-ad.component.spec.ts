import { ComponentFixture, TestBed } from '@angular/core/testing';

import { FruitsAdComponent } from './fruits-ad.component';

describe('FruitsAdComponent', () => {
  let component: FruitsAdComponent;
  let fixture: ComponentFixture<FruitsAdComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [FruitsAdComponent]
    });
    fixture = TestBed.createComponent(FruitsAdComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
