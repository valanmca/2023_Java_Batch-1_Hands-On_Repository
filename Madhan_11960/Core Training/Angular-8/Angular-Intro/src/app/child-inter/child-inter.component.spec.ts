import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ChildInterComponent } from './child-inter.component';

describe('ChildInterComponent', () => {
  let component: ChildInterComponent;
  let fixture: ComponentFixture<ChildInterComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [ChildInterComponent]
    });
    fixture = TestBed.createComponent(ChildInterComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
