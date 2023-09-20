import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ChildEmpInfoComponent } from './child-emp-info.component';

describe('ChildEmpInfoComponent', () => {
  let component: ChildEmpInfoComponent;
  let fixture: ComponentFixture<ChildEmpInfoComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [ChildEmpInfoComponent]
    });
    fixture = TestBed.createComponent(ChildEmpInfoComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
