import { ComponentFixture, TestBed } from '@angular/core/testing';

import { TempdrivformComponent } from './tempdrivform.component';

describe('TempdrivformComponent', () => {
  let component: TempdrivformComponent;
  let fixture: ComponentFixture<TempdrivformComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [TempdrivformComponent]
    });
    fixture = TestBed.createComponent(TempdrivformComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
