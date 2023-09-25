import { ComponentFixture, TestBed } from '@angular/core/testing';

import { AssignfactComponent } from './assignfact.component';

describe('AssignfactComponent', () => {
  let component: AssignfactComponent;
  let fixture: ComponentFixture<AssignfactComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [AssignfactComponent]
    });
    fixture = TestBed.createComponent(AssignfactComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
