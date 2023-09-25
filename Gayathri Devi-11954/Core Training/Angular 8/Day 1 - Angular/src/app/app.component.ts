import { ThisReceiver } from '@angular/compiler';
import { Component } from '@angular/core';

@Component({
  selector: 'app-root',//name of the component
  templateUrl: './app.component.html',//html file, only one 
  styleUrls: ['./app.component.css']//css files, add more than 1 css files
})
export class AppComponent {
  // title = 'First-Angular-App';
  empId:number;
  empName:string;
  empSalary:number;
  
  constructor(){
    this.empId=101;
    this.empName="Gayathri";
    this.empSalary=10000;
  }
  getAddition(a:number,b:number):number{
    let sum=a+b;
    return sum;
  }
  getFactorial(c:number):number{
    let i=1;
    let fact=1;
    for(i=1;i<=c;i++){
      fact = fact*i;     
    } return fact;
  }
}
