import { ComponentFixture, TestBed } from '@angular/core/testing';

import { TemplatedriveComponent } from './templatedrive.component';

describe('TemplatedriveComponent', () => {
  let component: TemplatedriveComponent;
  let fixture: ComponentFixture<TemplatedriveComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [TemplatedriveComponent]
    });
    fixture = TestBed.createComponent(TemplatedriveComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
