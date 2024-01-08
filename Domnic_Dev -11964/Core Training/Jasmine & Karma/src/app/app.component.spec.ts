import { TestBed } from '@angular/core/testing';
import { RouterTestingModule } from '@angular/router/testing';
import { AppComponent } from './app.component';


describe('My Test Runner1', () => {
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
         
 });

 describe('My Test Runner2',()=> {
  it('Multiplication Test with 2 positives', () => {
    const fixture = TestBed.createComponent(AppComponent);
    const app = fixture.componentInstance;
    expect(app.multiplication(20, 10)).toEqual(200);
  });

  it('Multiplication Test with 1 positive 1 negative', () => {
    const fixture = TestBed.createComponent(AppComponent);
    const app = fixture.componentInstance;
    expect(app.multiplication(20, -10)).toEqual(-200);
  });
  it('Multiplication Test with 2 negative', () => {
    const fixture = TestBed.createComponent(AppComponent);
    const app = fixture.componentInstance;
    expect(app.multiplication(-20, -10)).toEqual(200);
  });

 });

 describe('My Test Runner3',()=> {

  it('Factorial Test with 0', () => {
    const fixture = TestBed.createComponent(AppComponent);
    const app = fixture.componentInstance;
    expect(app.factorial(0)).toEqual(1);
  });
  it('Factorial Test with positive value', () => {
    const fixture = TestBed.createComponent(AppComponent);
    const app = fixture.componentInstance;
    expect(app.factorial(5)).toEqual(120);
  });
  it('Factorial Test with negative value', () => {
    const fixture = TestBed.createComponent(AppComponent);
    const app = fixture.componentInstance;
    expect(app.factorial(-5)).toEqual(0);
  });
  it('Prime Test (with prime)', () => {
    const fixture = TestBed.createComponent(AppComponent);
    const app = fixture.componentInstance;
    expect(app.prime(5)).toEqual(true);
  });

  it('Prime Test (with not a prime)', () => {
    const fixture = TestBed.createComponent(AppComponent);
    const app = fixture.componentInstance;
    expect(app.prime(6)).toEqual(false);
  });
 });