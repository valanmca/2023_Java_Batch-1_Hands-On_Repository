import { ComponentFixture, TestBed } from '@angular/core/testing';

import { SecondchildComponent } from './secondchild.component';

describe('SecondchildComponent', () => {
  let component: SecondchildComponent;
  let fixture: ComponentFixture<SecondchildComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [SecondchildComponent]
    });
    fixture = TestBed.createComponent(SecondchildComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
