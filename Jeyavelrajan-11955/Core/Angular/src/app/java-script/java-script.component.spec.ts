import { ComponentFixture, TestBed } from '@angular/core/testing';

import { JavaScriptComponent } from './java-script.component';

describe('JavaScriptComponent', () => {
  let component: JavaScriptComponent;
  let fixture: ComponentFixture<JavaScriptComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [JavaScriptComponent]
    });
    fixture = TestBed.createComponent(JavaScriptComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
