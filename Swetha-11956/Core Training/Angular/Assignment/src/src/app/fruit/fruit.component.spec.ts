import { ComponentFixture, TestBed } from '@angular/core/testing';

import { FruitComponent } from './fruit.component';

describe('FruitComponent', () => {
  let component: FruitComponent;
  let fixture: ComponentFixture<FruitComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [FruitComponent]
    });
    fixture = TestBed.createComponent(FruitComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
