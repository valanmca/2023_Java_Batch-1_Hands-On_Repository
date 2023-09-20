import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ChildFactorialComponent } from './child-factorial.component';

describe('ChildFactorialComponent', () => {
  let component: ChildFactorialComponent;
  let fixture: ComponentFixture<ChildFactorialComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [ChildFactorialComponent]
    });
    fixture = TestBed.createComponent(ChildFactorialComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
