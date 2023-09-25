import { Component } from '@angular/core';

@Component({
  selector: 'app-child2',
  templateUrl: './child2.component.html',
  styleUrls: ['./child2.component.css']
})
export class Child2Component {
ename:string;
email:string;
imagepath:string;
width:number;
height:number;
constructor(){
  this.ename="Domnicdev";
  this.email="domdev97@gmail.com";
  this.imagepath="https://pluralsight2.imgix.net/paths/images/angular-14a0f6532f.png";
  this.width=350;
  this.height=250;
}
changeName(){
  if(this.ename=="Domnicdev")
  {
    this.ename="Saul Goodman";
  }
  else
  {
    this.ename="Domnicdev";
  }
}
changeEmail(){
  if (this.email=="domdev97@gmail.com"){
    this.email="bettercallsaul@yahoo";
  }
  else
  {this.email="domdev97@gmail.com"}
}
changeImage(){
  if (this.imagepath=="https://pluralsight2.imgix.net/paths/images/angular-14a0f6532f.png")
  {
    this.imagepath="https://m.media-amazon.com/images/S/pv-target-images/fe1c0138b7b0e05ea22a711f44e57cd80cfbaea30745c425b7043d786ba66cd1.jpg";
  }
  else
  {
    this.imagepath="https://pluralsight2.imgix.net/paths/images/angular-14a0f6532f.png"
  }
}
}
