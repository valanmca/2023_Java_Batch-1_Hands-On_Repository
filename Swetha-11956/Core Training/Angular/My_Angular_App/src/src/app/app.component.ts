import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  empid: number;
  empname: string;
  empsalary: number;
  email: string;
  image:string;
  imgwidth:number;
  imgheight:number;
  name:string="";

  constructor(){
    this.empid=11956;
    this.empname="Swetha";
    this.empsalary=200000;
    this.email="swetha@gmail.com";
    this.image="./assets/image ang.png";
    this.imgwidth=200;
    this.imgheight=180;
    
  }
  getaddition(a:number,b:number):number{
    let sum=a+b;
    return sum;
  }

  getfactorial(n:number):number{
    let i;
    let fact=1;
    for(i=1;i<=n;i++){
      fact=fact*i;
    }
    return fact;
  }
  changeName(){
    if(this.empname=="swetha")
      this.empname="Arun";
    else 
      this.empname="swetha";
  }
  changeEmail(){
    if(this.email=="arun123@gmail.com")
      this.email="swetha@gmail.com";
    else
      this.email="arun123@gmail.com";
  }
  changeImage(){
    this.image="./assets/logo1.png";
  }
}
