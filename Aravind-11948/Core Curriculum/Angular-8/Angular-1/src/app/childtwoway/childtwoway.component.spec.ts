import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ChildtwowayComponent } from './childtwoway.component';

describe('ChildtwowayComponent', () => {
  let component: ChildtwowayComponent;
  let fixture: ComponentFixture<ChildtwowayComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [ChildtwowayComponent]
    });
    fixture = TestBed.createComponent(ChildtwowayComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
