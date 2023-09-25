import { ComponentFixture, TestBed } from '@angular/core/testing';

import { MatrialRegisterFormComponent } from './matrial-register-form.component';

describe('MatrialRegisterFormComponent', () => {
  let component: MatrialRegisterFormComponent;
  let fixture: ComponentFixture<MatrialRegisterFormComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [MatrialRegisterFormComponent]
    });
    fixture = TestBed.createComponent(MatrialRegisterFormComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
