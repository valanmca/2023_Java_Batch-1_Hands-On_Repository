import { Component } from '@angular/core';

@Component({
  selector: 'app-twoway-data-binding',
  templateUrl: './twoway-data-binding.component.html',
  styleUrls: ['./twoway-data-binding.component.css']
})
export class TwowayDataBindingComponent {
name :string=" ";

eId : number;
eName : string;
eSalary : number;
eMail : string;
imagePath : string;
imgHeight : number;
imgWidth : number;

constructor(){
  this.eId = 11954;
  this.eName = "Gayathri Kuppusamy";
  this.eSalary = 56789;
  this.eMail = "gayathri@gmail.com";
  this.imagePath= "./assets/logo.png";
  this.imgHeight = 100;
  this.imgWidth = 250;
}

changeId(){
  if(this.eId==11954)
      this.eId=420;
  else  
      this.eId=11954;
}
changeSalary(){
  if(this.eSalary== 56789)
      this.eSalary = 987650;
  else  
      this.eSalary = 56789;
}
changeName(){
  if(this.eName=="Gayathri Kuppusamy")
      this.eName="Yathrik Sam";
  else
      this.eName = "Gayathri Kuppusamy";
}
changeImage(){
  if(this.imagePath=="./assets/newlogo.png")
      this.imagePath ="./assets/logo.png" ;
  else
      this.imagePath = "./assets/newlogo.png";
}
}
