import { Component } from '@angular/core';

@Component({
  selector: 'app-child-attribute',
  templateUrl: './child-attribute.component.html',
  styleUrls: ['./child-attribute.component.css']
})
export class ChildAttributeComponent {
    myColor : {};
    myClass :string;
    myClass1 :string;

    constructor()
    {
      this.myColor="blue";
      this.myClass="myClass1";
      this.myClass1="myClass2";
    }
    
    changeColor()
    {
      if(this.myColor=="blue")
      {
        this.myColor="red";
      } else{
        this.myColor="blue"
      }
    }

    changeColorStyle()
    {
      if(this.myClass=="myClass1")
      {
        this.myClass="myClass2";
      } 
      else{
        this.myClass="myClass1";
      }
    }
}
