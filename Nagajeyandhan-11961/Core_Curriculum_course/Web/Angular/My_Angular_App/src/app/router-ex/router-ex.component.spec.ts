import { ComponentFixture, TestBed } from '@angular/core/testing';

import { RouterExComponent } from './router-ex.component';

describe('RouterExComponent', () => {
  let component: RouterExComponent;
  let fixture: ComponentFixture<RouterExComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [RouterExComponent]
    });
    fixture = TestBed.createComponent(RouterExComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
