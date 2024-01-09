import { TestBed } from '@angular/core/testing';
import { RouterTestingModule } from '@angular/router/testing';
import { AppComponent } from './app.component';

/*describe('MyTestRunner', () => {
  beforeEach(() => TestBed.configureTestingModule({
    imports: [RouterTestingModule],
    declarations: [AppComponent]
  }));

  xit('should create the app', () => {
    const fixture = TestBed.createComponent(AppComponent);
    const app = fixture.componentInstance;
    expect(app).toBeTruthy();
  });

  it(`should have as title 'AngularUIUnitTestingProject'`, () => {
    const fixture = TestBed.createComponent(AppComponent);
    const app = fixture.componentInstance;
    expect(app.title).toEqual('AngularUIUnitTestingProject');
  });

  it('should render title', () => {
    const fixture = TestBed.createComponent(AppComponent);
    fixture.detectChanges();
    const compiled = fixture.nativeElement as HTMLElement;
    expect(compiled.querySelector('.content span')?.textContent).toContain('AngularUIUnitTestingProject app is running!');
  });
});*/
/*xdescribe('My Test Runner 1', () => {
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
describe('My Test Runner 2' , () => {
  xit('Multiplication Test', () => {
    const fixture = TestBed.createComponent(AppComponent);
    const app = fixture.componentInstance;
    expect(app.multiplication(10, 50)).toEqual(500);
  });  
});
describe('My Test Runner 3' , () => {
it('PrimeNumber Test for prime' , () => {
const fixture = TestBed.createComponent(AppComponent);
const app = fixture.componentInstance;
expect(app.primeNumber(73)).toEqual(true);
});
it('PrimeNumber Test for non prime' , () => {
  const fixture = TestBed.createComponent(AppComponent);
  const app = fixture.componentInstance;
  expect(app.primeNumber(6)).toEqual(false);
});
it('Factorial Test for positive number', () => {
  const fixture = TestBed.createComponent(AppComponent);
  const app = fixture.componentInstance;
  expect(app.factorial(5)).toEqual(120);
});
it('Factorial Test for negative number', () => {
  const fixture = TestBed.createComponent(AppComponent);
  const app = fixture.componentInstance;
  expect(app.factorial(-5)).toEqual(1);
});
});*/
/*describe('Angular Front End (UI) Unit Testing' , () => {
it('Bold Test Unit Test' ,() => {
  const fixture = TestBed.createComponent(AppComponent);
  fixture.detectChanges();
  const compiled = fixture.nativeElement as HTMLElement;
  expect(compiled.querySelector('b')?.textContent).toContain("Welcome to the Angular UI Testing");
});
it('Name Check Test' ,() => {
  const fixture = TestBed.createComponent(AppComponent);
  const app = fixture.componentInstance;
  expect(app.name).toEqual('PravinKumar');
});
it('Bold Test Unit Test for Name' ,() => {
  const fixture = TestBed.createComponent(AppComponent);
  fixture.detectChanges();
  const compiled = fixture.nativeElement as HTMLElement;
  expect(compiled.querySelector('h3')?.textContent).toContain("PravinKumar");
});
it('Email Check Test' ,() => {
  const fixture = TestBed.createComponent(AppComponent);
  const app = fixture.componentInstance;
  expect(app.email).toEqual('rjpravin146@gmail.com');
});
it('Bold Test Unit Test for Email' ,() => {
  const fixture = TestBed.createComponent(AppComponent);
  fixture.detectChanges();
  const compiled = fixture.nativeElement as HTMLElement;
  expect(compiled.querySelector('.Email')?.textContent).toContain("My Email is : rjpravin146@gmail.com");
});
});*/
describe('Angular Form Unit Testing' , () => {
it('Login Form GUI count' , () => 
{
  const fixture = TestBed.createComponent(AppComponent);
  const formElement = fixture.debugElement.nativeElement.querySelector("#LoginForm");
  const inputElements = formElement.querySelectorAll("input");
  expect(inputElements.length).toEqual(3);
});
it('Testing Form Initial Values' , () => {
  const fixture = TestBed.createComponent(AppComponent);
  const app = fixture.componentInstance;
  const loginFormGroup = app.loginForm;
  const loginFormValues = {
    username : 'rjpravin146@gmail.com',
    password : ''
  }
  expect(loginFormGroup.value).toEqual(loginFormValues);
});
it('Testing Form Valid' , () => {
  const fixture = TestBed.createComponent(AppComponent);
  const app = fixture.componentInstance;
  app.loginForm.controls?.['username'].setValue("rjpravin146@gmail.com");
  app.loginForm.controls?.['password'].setValue("123456");
  expect(app.loginForm.valid).toBeTruthy();
});
});



