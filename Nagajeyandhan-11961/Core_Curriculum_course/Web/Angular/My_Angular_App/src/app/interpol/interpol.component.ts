import { Component } from '@angular/core';

@Component({
  selector: 'app-interpol',
  templateUrl: './interpol.component.html',
  styleUrls: ['./interpol.component.css']
})
export class InterpolComponent {
  emp_Id : number;
  emp_Name : string;
  emp_Salary : number;
  email_id : string;
  
  constructor(){
    this.emp_Id = 1;
    this.emp_Name = "Jeyandhan";
    this.emp_Salary = 15000;
    this.email_id = "jeyandhan@gmail.com";
  }
  getAddition( a: number, b : number) : number{
    let Sum = a + b;
    return Sum;
  }
  getFact(a: number): number{
    let fact = 1,i;

    for(i=1;i<= a; i++){
      fact=fact*i;
    }
    return fact;
  }
}
