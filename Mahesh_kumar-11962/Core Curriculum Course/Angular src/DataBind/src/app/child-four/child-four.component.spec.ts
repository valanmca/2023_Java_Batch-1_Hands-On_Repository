import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ChildFourComponent } from './child-four.component';

describe('ChildFourComponent', () => {
  let component: ChildFourComponent;
  let fixture: ComponentFixture<ChildFourComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [ChildFourComponent]
    });
    fixture = TestBed.createComponent(ChildFourComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
