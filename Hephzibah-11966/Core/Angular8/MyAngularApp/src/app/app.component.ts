import { Attribute, Component } from '@angular/core';
import { CalculatorService } from './calculator.service';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  empid: number;
  empname: string;
  empsalary: number;
  email:string;
  image:string;
  imgwidth: number;
  imgheight: number;
  name: string="";

  constructor()
  {
    this.empid=111;
    this.empname="hephzi";
    this.empsalary=2000;
    this.email="tohephzi@gmail.com";
    this.image="./assets/logo1.png";
    this.imgwidth= 300;
    this.imgheight=100;
  }
  changename(){
    if(this.empname=="hephzi")
       this.empname="emima";
    else
       this.empname="hephzi"; 
  }
  changeemail(){
    if(this.email=="tohephzi@gmail.com")
      this.email="emima.s2002@gmail.com";
    else
    this.email="tohephzi@gmail.com";
  }
  changeimage(){
    if(this.image=="./assets/logo1.png")
      this.image="./assets/logo3.png";
    else
    this.image="./assets/logo1.png"   
  }
  getaddition(a:number, b:number) : number
  {
    let sum=a+b;
    return sum;
  }
  getfactorial(n:number): number {
    let i=1;
    let fact=1;
    for(i=1; i<=n; i++){
      fact=fact*i;
      
    }
    return fact;

  }
  
}
