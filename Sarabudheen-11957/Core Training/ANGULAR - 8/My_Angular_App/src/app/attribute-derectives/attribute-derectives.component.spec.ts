import { ComponentFixture, TestBed } from '@angular/core/testing';

import { AttributeDerectivesComponent } from './attribute-derectives.component';

describe('AttributeDerectivesComponent', () => {
  let component: AttributeDerectivesComponent;
  let fixture: ComponentFixture<AttributeDerectivesComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [AttributeDerectivesComponent]
    });
    fixture = TestBed.createComponent(AttributeDerectivesComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
