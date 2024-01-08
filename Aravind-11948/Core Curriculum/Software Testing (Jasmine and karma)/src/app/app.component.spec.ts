import { TestBed } from '@angular/core/testing';
import { RouterTestingModule } from '@angular/router/testing';
import { AppComponent } from './app.component';

describe('Addition and Subtraction', () => {
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
//Multiplication

describe ('Multiplication ', ()=>{

  it('multiplication Test for input +ve * +ve value', () => {
    const fixture = TestBed.createComponent(AppComponent);
    const app = fixture.componentInstance;
    expect(app.multiplication(20, 10)).toEqual(200);
  });

  it('multiplication Test for input 0 *+ve value', () => {
    const fixture = TestBed.createComponent(AppComponent);
    const app = fixture.componentInstance;
    expect(app.multiplication(0, 10)).toEqual(0);
  });

  it('multiplication Test for input 0 *-ve value', () => {
    const fixture = TestBed.createComponent(AppComponent);
    const app = fixture.componentInstance;
    expect(app.multiplication(0, -10)).toEqual(-0);
  });

  it('multiplication Test for input -ve *+ve value', () => {
    const fixture = TestBed.createComponent(AppComponent);
    const app = fixture.componentInstance;
    expect(app.multiplication(-2, 10)).toEqual(-20);
  });

  it('multiplication Test for input -ve * -ve value', () => {
    const fixture = TestBed.createComponent(AppComponent);
    const app = fixture.componentInstance;
    expect(app.multiplication(-2, -10)).toEqual(20);
  });
  
  
 });

 //factorial

 describe ('factorial', ()=>{

  it('factorial Test for 0', () => {
    const fixture = TestBed.createComponent(AppComponent);
    const app = fixture.componentInstance;
    expect(app.getFactorial(0)).toEqual(1);
  });


  it('factorial Test for positive number', () => {
    const fixture = TestBed.createComponent(AppComponent);
    const app = fixture.componentInstance;
    expect(app.getFactorial(5)).toEqual(120);
  });

  it('factorial Test for negative number', () => {
    const fixture = TestBed.createComponent(AppComponent);
    const app = fixture.componentInstance;
    expect(app.getFactorial(-2)).toEqual(0);
  });

  


});
//Prime number

describe ('prime', ()=>{

  it('Given no is prime', () => {
    const fixture = TestBed.createComponent(AppComponent);
    const app = fixture.componentInstance;
    expect(app.isPrime(5)).toEqual(true);
  });

  it('Given no is not prime', () => {
    const fixture = TestBed.createComponent(AppComponent);
    const app = fixture.componentInstance;
    expect(app.isPrime(16)).toEqual(false);
  });

  it('Given no is 0', () => {
    const fixture = TestBed.createComponent(AppComponent);
    const app = fixture.componentInstance;
    expect(app.isPrime(0)).toEqual(false);
  });

  it('Given no is 1', () => {
    const fixture = TestBed.createComponent(AppComponent);
    const app = fixture.componentInstance;
    expect(app.isPrime(1)).toEqual(false);
  });

  it('Given no is 2', () => {
    const fixture = TestBed.createComponent(AppComponent);
    const app = fixture.componentInstance;
    expect(app.isPrime(2)).toEqual(true);
  });

});
