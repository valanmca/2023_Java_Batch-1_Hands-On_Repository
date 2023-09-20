import { Component } from '@angular/core';

@Component({
  selector: 'app-child-event',
  templateUrl: './child-event.component.html',
  styleUrls: ['./child-event.component.css']
})
export class ChildEventComponent {

  name:string;
  imagepath1:string;
  imagepath2:string;

  constructor(){
    this.name="Aravind";
    this.imagepath1="./assets/logo2.png"
    this.imagepath2="./assets/logo3.png"
  }
  ChangeName(){
    if(this.name=="Aravind"){
    this.name="Aravind Subbaian";
    }
    else{
    this.name="Aravind";
    }
    
    
    
  }
  ChangeImage(){
    if(this.imagepath1=="./assets/logo2.png")
    {
      this.imagepath1="./assets/logo3.png";
    }
    else{
      this.imagepath1="./assets/logo2.png";
    }
  }

}
