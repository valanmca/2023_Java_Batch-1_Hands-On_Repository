import { Component } from '@angular/core';

@Component({
  selector: 'app-eventbind',
  templateUrl: './eventbind.component.html',
  styleUrls: ['./eventbind.component.css']
})
export class EventbindComponent {
    email_Id : string;
    name: string;
    imagepath: string;
    height: number;
    width: number;

    constructor(){
      this.name = "Naga";
      this.email_Id = "naga11@gmail.com"
      this.imagepath = "./assets/Angular.png"
      this.width = 70
      this.height = 70
    }

    changeName(){
      if(this.name=="Naga")
        this.name = "Jeyandhan"
      else
        this.name = "Naga"
    }
    changeEmail(){
      if(this.email_Id == "naga11@gmail.com")
        this.email_Id = "jeyandhan25@gmail.com"
      else
        this.email_Id = "naga11@gmail.com"
    }
    changeImage(){
      if(this.imagepath == "./assets/Angular.png")
        this.imagepath = "./assets/Angular1.jpg"
      else
      this.imagepath="./assets/Angular.png"
    }
}
