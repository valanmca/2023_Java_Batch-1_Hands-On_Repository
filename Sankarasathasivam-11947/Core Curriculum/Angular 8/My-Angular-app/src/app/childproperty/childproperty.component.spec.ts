import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ChildpropertyComponent } from './childproperty.component';

describe('ChildpropertyComponent', () => {
  let component: ChildpropertyComponent;
  let fixture: ComponentFixture<ChildpropertyComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [ChildpropertyComponent]
    });
    fixture = TestBed.createComponent(ChildpropertyComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
