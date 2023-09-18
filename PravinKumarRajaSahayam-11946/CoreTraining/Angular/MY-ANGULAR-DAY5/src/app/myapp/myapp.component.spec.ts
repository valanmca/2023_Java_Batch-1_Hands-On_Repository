import { ComponentFixture, TestBed } from '@angular/core/testing';

import { MyappComponent } from './myapp.component';

describe('MyappComponent', () => {
  let component: MyappComponent;
  let fixture: ComponentFixture<MyappComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [MyappComponent]
    });
    fixture = TestBed.createComponent(MyappComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
