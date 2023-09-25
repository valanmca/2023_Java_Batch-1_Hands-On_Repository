import { ComponentFixture, TestBed } from '@angular/core/testing';

import { SecongComponent } from './secong.component';

describe('SecongComponent', () => {
  let component: SecongComponent;
  let fixture: ComponentFixture<SecongComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [SecongComponent]
    });
    fixture = TestBed.createComponent(SecongComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
