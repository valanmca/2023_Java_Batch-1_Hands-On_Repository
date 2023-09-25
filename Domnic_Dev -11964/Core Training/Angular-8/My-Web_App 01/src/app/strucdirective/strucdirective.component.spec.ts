import { ComponentFixture, TestBed } from '@angular/core/testing';

import { StrucdirectiveComponent } from './strucdirective.component';

describe('StrucdirectiveComponent', () => {
  let component: StrucdirectiveComponent;
  let fixture: ComponentFixture<StrucdirectiveComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [StrucdirectiveComponent]
    });
    fixture = TestBed.createComponent(StrucdirectiveComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
