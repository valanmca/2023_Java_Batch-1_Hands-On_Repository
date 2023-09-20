import { Component } from '@angular/core';

@Component({
  selector: 'app-child-attribute',
  templateUrl: './child-attribute.component.html',
  styleUrls: ['./child-attribute.component.css']
})
export class ChildAttributeComponent {
  myColor:string ;
  myClass:string;
  
  constructor(){
    this.myColor="red";
    this.myClass="myclass1";
  }

  changestyle(){
    if(this.myColor=="red")
    {
      this.myColor="green";
    }
    else if(this.myColor=="green")
    {
      this.myColor="blue";
    }
    else if(this.myColor=="blue")
    {
      this.myColor="red";
    }


  }

  changeStylengclass()
  {
    if(this.myClass=="myclass1")
    {
      this.myClass="myclass2"
      }

      else if(this.myClass=="myclass2")
      {
        this.myClass="myclass3"
        }

        else if(this.myClass=="myclass3")
        {
          this.myClass="myclass1"
          }
  }

}
