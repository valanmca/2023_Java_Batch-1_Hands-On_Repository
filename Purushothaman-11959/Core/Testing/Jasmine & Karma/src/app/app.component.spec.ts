import { TestBed } from '@angular/core/testing';
import { RouterTestingModule } from '@angular/router/testing';
import { AppComponent } from './app.component';

describe('My Test Runner 1', () => {
  it('Addition Test', () => {
    const fixture = TestBed.createComponent(AppComponent);
    const app = fixture.componentInstance;
    expect(app.addition(10, 20)).toEqual(30);
  });
  it('Subtraction Test', () => {
    const fixture = TestBed.createComponent(AppComponent);
    const app = fixture.componentInstance;
    expect(app.subtraction(20, 10)).toEqual(10);
  });
  it('Multiplication Test', () => {
    const fixture = TestBed.createComponent(AppComponent);
    const app = fixture.componentInstance;
    expect(app.multiplication(20, 10)).toEqual(200);
  });     
});

describe('My test Runner 2',() => {
  it('Factorial Test 1', () => {
      const fixture = TestBed.createComponent(AppComponent);
      const app = fixture.componentInstance;
      expect(app.factorial(5)).toEqual(120);
  }); 
  it('Prime Number Test', () => {
      const fixture = TestBed.createComponent(AppComponent);
      const app = fixture.componentInstance;
      expect(app.isPrime(11)).toEqual(true);
  });           
});

