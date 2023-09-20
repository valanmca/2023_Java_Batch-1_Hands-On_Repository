import { Component, numberAttribute } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  empid :number;
  empname :string;
  empsalary:number;
  fullName:string="Java tpoint";
  
  

  constructor(){
    this.empid=101;
    this.empname="Aravind";
    this.empsalary=20000;

  }

  getaddition(a:number,b:number):number{
    let sum=a+b;
    return sum;
  }

  getfact(a:number):number{
    let fact=1;
   for(let i=1;i<=a;i++)
   {
    fact=fact*i;

   }
   return fact;
  }
}

