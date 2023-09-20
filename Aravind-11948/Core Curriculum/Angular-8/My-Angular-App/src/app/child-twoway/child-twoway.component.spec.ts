import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ChildTwowayComponent } from './child-twoway.component';

describe('ChildTwowayComponent', () => {
  let component: ChildTwowayComponent;
  let fixture: ComponentFixture<ChildTwowayComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [ChildTwowayComponent]
    });
    fixture = TestBed.createComponent(ChildTwowayComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
