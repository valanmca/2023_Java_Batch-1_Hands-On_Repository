import { Component } from '@angular/core';

@Component({
  selector: 'app-child-attribute',
  templateUrl: './child-attribute.component.html',
  styleUrls: ['./child-attribute.component.css']
})
export class ChildAttributeComponent {


 myStyle:{};
 myColor:string;
 myStylets:string;
  constructor(){
    this.myStyle={'color':'White','background-color':"red"}

    this.myColor="red";
    this.myStylets="myStyle1";
  }

  changeColor()
  {
    if(this.myColor=="red")
    {
      this.myColor="green";
    }

    else if(this.myColor=="green")
    {
      this.myColor="violet";
    }

    else if(this.myColor=="violet")
    {
      this.myColor="red";
    }
  }

  changeClass()
  {
    if(this.myStylets=="myStyle1")
    {
      this.myStylets="myStyle2";
    }

    else if(this.myStylets=="myStyle2")
    {
      this.myStylets="myStyle3";
    }

    else if(this.myStylets=="myStyle3")
    {
      this.myStylets="myStyle1";
    }
  }
  

}
