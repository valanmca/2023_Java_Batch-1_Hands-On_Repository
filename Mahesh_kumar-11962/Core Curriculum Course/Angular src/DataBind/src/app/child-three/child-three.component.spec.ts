import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ChildThreeComponent } from './child-three.component';

describe('ChildThreeComponent', () => {
  let component: ChildThreeComponent;
  let fixture: ComponentFixture<ChildThreeComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [ChildThreeComponent]
    });
    fixture = TestBed.createComponent(ChildThreeComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
