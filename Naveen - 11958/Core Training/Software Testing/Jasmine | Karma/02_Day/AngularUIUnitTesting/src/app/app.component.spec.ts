import { TestBed } from '@angular/core/testing';
import { RouterTestingModule } from '@angular/router/testing';
import { AppComponent } from './app.component';
import { By } from '@angular/platform-browser';

/*describe('My Test Suite', () => {
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

describe('My Test Runner 2', () => {
  it('Factorial Test', () => {
    const fixture = TestBed.createComponent(AppComponent);
    const app = fixture.componentInstance;
    expect(app.factorial(5)).toEqual(120);
  });
  it('Prime Test', () => {
    const fixture = TestBed.createComponent(AppComponent);
    const app = fixture.componentInstance;
    //expect(app.isPrime(17)).toEqual(true);
    expect(app.isPrime(17)).toBeTruthy(true);
  });
});
*/

/*describe('ANgular Front End(UI) Unit Testing', () => {
  it('Bold tag Unit Test', () => {
    const fixture = TestBed.createComponent(AppComponent);
    fixture.detectChanges();
    const compiled = fixture.nativeElement as HTMLElement;
    expect(compiled.querySelector('b')?.textContent).toContain("Welcome to Angular UI Testing!");
  });

  it('Name Check Unit Test', () => {
    const fixture = TestBed.createComponent(AppComponent);
    const app = fixture.componentInstance;
    expect(app.name).toEqual('Naveenraj');
  });

  it('H2 tag Unit Test', () => {
    const fixture = TestBed.createComponent(AppComponent);
    fixture.detectChanges();
    const compiled = fixture.nativeElement as HTMLElement;
    expect(compiled.querySelector('h2')?.textContent).toContain("Naveenraj");
  });

  it('Email Check Unit Test', () => {
    const fixture = TestBed.createComponent(AppComponent);
    const app = fixture.componentInstance;
    expect(app.email).toEqual('naveenraj@gmail.com');
  });

  it('Div tag Unit Test', () => {
    const fixture = TestBed.createComponent(AppComponent);
    fixture.detectChanges();
    const compiled = fixture.nativeElement as HTMLElement;
    expect(compiled.querySelector('#email')?.textContent).toContain("My Email is naveenraj@gmail.com");
  });
  

});*/
describe('ANgular Form Unit Testing', () =>{
  it('Login Form GUI Count', ()=>{
    const fixture = TestBed.createComponent(AppComponent);
    const formElement = fixture.debugElement.nativeElement.querySelector("#LoginForm");
    const inputElements = formElement.querySelectorAll("input");
    expect(inputElements.length).toEqual(3);
  });

  it('Testing Form Initial Values', ()=>{
    const fixture = TestBed.createComponent(AppComponent);
    const app = fixture.componentInstance;
    const loginFormGroup = app.LoginForm;
    const loginFormValues = {
      username : 'example@gmail.com',
      password : ''
    }
    expect(loginFormGroup.value).toEqual(loginFormValues);
  });

  it('Testing Form Valid', ()=>{
    const fixture = TestBed.createComponent(AppComponent);
    const app = fixture.componentInstance;
    app.LoginForm.controls?.['username'].setValue("example@gmail.com");
    app.LoginForm.controls?.['password'].setValue("12314");
    expect(app.LoginForm.valid).toBeTruthy();
  });
});
