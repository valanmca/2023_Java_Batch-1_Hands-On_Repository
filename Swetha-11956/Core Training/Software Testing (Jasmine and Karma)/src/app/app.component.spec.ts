import { TestBed } from '@angular/core/testing';
import { RouterTestingModule } from '@angular/router/testing';
import { AppComponent } from './app.component';

/*describe('My Test Runner 1 ', () => {
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
    expect(app.Multiplication(2, 10)).toEqual(20);
  });  
  
});

describe ('My Test Runner 2', () => {
  
  it('Factorial Test', () => {
    const fixture = TestBed.createComponent(AppComponent);
    const app = fixture.componentInstance;
    expect(app.Factorial(5)).toEqual(120);
  });

  it('Prime Test', () => {
    const fixture = TestBed.createComponent(AppComponent);
    const app = fixture.componentInstance;
    expect(app.Prime(5)).toEqual(true);
  });

});


*/

/*describe ('Angular Front End(UI) Unit Testing', () =>{

  it ('Bold Tag Unit Test ', () =>{
    const fixture = TestBed.createComponent(AppComponent);
    fixture.detectChanges();
    const compiled = fixture.nativeElement as HTMLElement;
    expect(compiled.querySelector('b')?.textContent).toContain("Welcome to Angular UI Testing");
  });

  it ('Name Check Unit Test ', () =>{
    const fixture = TestBed.createComponent(AppComponent);
    const app = fixture.componentInstance;
    expect(app.name).toEqual('Swetha');
  });

  it ('H3 Tag Unit Test ', () =>{
    const fixture = TestBed.createComponent(AppComponent);
    fixture.detectChanges();
    const compiled = fixture.nativeElement as HTMLElement;
    expect(compiled.querySelector('h3')?.textContent).toContain("Swetha");
  });

  it ('Email Check Unit Test ', () =>{
    const fixture = TestBed.createComponent(AppComponent);
    const app = fixture.componentInstance;
    expect(app.email).toEqual('swethacse2002@gmail.com');
  });

  it ('Div tag Unit Test ', () =>{
    const fixture = TestBed.createComponent(AppComponent);
    fixture.detectChanges();
    const compiled = fixture.nativeElement as HTMLElement;
    expect(compiled.querySelector('.email1')?.textContent).toContain(" My Email is : swethacse2002@gmail.com");
  });


})
*/

describe('Angular form Unit Testing', () => {
  it ('Login Form GUI count ', ()=>{
    const fixture = TestBed.createComponent(AppComponent);
    const formElement = fixture.debugElement.nativeElement.querySelector("#LoginForm");
    const inputElements = formElement.querySelectorAll("input");
    expect(inputElements.length).toEqual(3);
  });

  it('Tesing Form Initial Values',() =>{
    const fixture = TestBed.createComponent(AppComponent);
    const app = fixture.componentInstance;
    const loginFormGroup = app.loginForm;
    const loginFormValues = {
      username : 'example@gmail.com',
      password : ''
    }
    expect(loginFormGroup.value).toEqual(loginFormValues);
  });

  it ('Tesing Form Valid ', () =>{
    const fixture = TestBed.createComponent(AppComponent);
    const app = fixture.componentInstance;
    app.loginForm.controls?.['username'].setValue("swethacse@gmail.com");
    app.loginForm.controls?.['password'].setValue("12345");
    expect(app.loginForm.valid).toBeTruthy();
  })
});

