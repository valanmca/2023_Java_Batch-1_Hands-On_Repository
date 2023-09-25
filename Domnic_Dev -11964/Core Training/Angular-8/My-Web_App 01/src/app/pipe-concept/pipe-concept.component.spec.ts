import { ComponentFixture, TestBed } from '@angular/core/testing';

import { PipeConceptComponent } from './pipe-concept.component';

describe('PipeConceptComponent', () => {
  let component: PipeConceptComponent;
  let fixture: ComponentFixture<PipeConceptComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [PipeConceptComponent]
    });
    fixture = TestBed.createComponent(PipeConceptComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
