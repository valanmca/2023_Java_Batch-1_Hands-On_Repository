import { Component } from '@angular/core';

@Component({
  selector: 'app-child',
  templateUrl: './child.component.html',
  styleUrls: ['./child.component.css']
})
export class ChildComponent {
  eid:number;
  ename:string;
  esalary:number;
  email:string;
  imgPath:string;
  imgWidth:number;
  imgHeight:number;
  num1:number;
  num2:number;
  name:string;
  result:number;


  constructor(){
    this.eid = 101;
    this.ename = "Matthew";
    this.esalary = 2000;
    this.email = "barath12@gmail.com"
    this.imgPath = './assets/Angular-img.png'
    this.imgWidth=400;
    this.imgHeight=200;
    this.name = "BMW"
    this.num1 =0;
    this.num2 =0;
    this.result=0
  }

  getAddition(a:number,b:number){
    let sum = a+b;
    return sum;
  }

  getFactorial(num : number){
    let temp = 1;
    for (let i=1;i<=temp;i++){
      temp=temp*i;
    }
    return temp;
  }

  changeName(){
    if (this.ename=="Matthew"){
      this.ename = "Barath"
    }

    else if (this.ename=="Barath"){
      this.ename = "Matthew"
    }
    
  }
  changeEmail(){
    if(this.email == "barath12@gmail.com"){
      this.email = "jabarath02@gmail.com"
    }
    else{
      this.email = "barath12@gmail.com"
    }
    
  }

  changeImg(){
    if(this.imgPath=="./assets/Angular-img.png"){
      this.imgPath="./assets/Angular-img-2.png"
    }
    else{
      this.imgPath="./assets/Angular-img.png"
    }
    
  }

  valueReset(){
    this.num1=0;
    this.num2=0;
    this.result=0
  }

  disAddition(a:number,b:number){
    let sum = a+b;
    this.result=sum;
  }
  disSub(a:number,b:number){
    let sum = a-b;
    this.result=sum;
  }
  disMul(a:number,b:number){
    let sum = a*b;
    this.result=sum;
  }
  disDiv(a:number,b:number){
    let sum = a/b;
    this.result=sum;
  }

}
