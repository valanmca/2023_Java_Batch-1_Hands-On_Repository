import { Component } from '@angular/core';

@Component({
  selector: 'app-child-event',
  templateUrl: './child-event.component.html',
  styleUrls: ['./child-event.component.css']
})
export class ChildEventComponent {
  name:string;
  imgpath:string;
  constructor(){
    this.name="Aravind";
    this.imgpath="./assets/img1.jpg"
  }
  ChangeName(){
    if(this.name=="Aravind")
    {
      this.name="aravind";
    }
    else{
      this.name="Aravind";
    }
   
  }
  changeimg(){
    if(this.imgpath=="./assets/img1.jpg")
    {
      this.imgpath="./assets/img2.jpg";
    }
    else if (this.imgpath=="./assets/img2.jpg"){
      this.imgpath="./assets/img3.jpg";
    }
    else if(this.imgpath=="./assets/img3.jpg")
    {
      this.imgpath="./assets/img1.jpg";
    }
  }



}
