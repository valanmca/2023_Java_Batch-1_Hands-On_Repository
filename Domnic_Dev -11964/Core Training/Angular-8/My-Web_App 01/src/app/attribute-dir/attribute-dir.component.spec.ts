import { ComponentFixture, TestBed } from '@angular/core/testing';

import { AttributeDirComponent } from './attribute-dir.component';

describe('AttributeDirComponent', () => {
  let component: AttributeDirComponent;
  let fixture: ComponentFixture<AttributeDirComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [AttributeDirComponent]
    });
    fixture = TestBed.createComponent(AttributeDirComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
