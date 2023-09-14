import { Component } from '@angular/core';

@Component({
  selector: 'app-child-day2',
  templateUrl: './child-day2.component.html',
  styleUrls: ['./child-day2.component.scss']
})
export default class ChildDay2Component {
  eid: number;
  ename: string;
  esalary: number;
  email: string;
  imagePath: string;
  imageWidth: number;
  imageHeight: number;
  name: string = "";

  constructor(){
    this.eid = 101;
    this.ename = "Naveen";
    this.esalary = 100000;
    this.email = "naveen@gmail.com";
    this.imagePath = "./assets/p1.png";
    this.imageWidth = 300;
    this.imageHeight = 150;
    
  

  }

  getAddition(a:number, b:number):number{
    let sum = a+b;
    return sum;
  }

  changeId(){
    this.eid = 102;
  }
  changeName(){
    if(this.ename == "Naveen")
    this.ename = "Valan";
    else
    this.ename = "Naveen";
  }
  changeEmail(){
    this.email = "valan@gmail.com";
  }
  changeSalary(){
    this.esalary = 12000;
  }
  changeImage(){
    if(this.imagePath == "./assets/p1.png")
     this.imagePath = "./assets/p2.png"
    else
     this.imagePath = "./assets/p1.png"
  }



}
