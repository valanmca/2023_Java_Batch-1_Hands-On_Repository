import { Component } from '@angular/core';

@Component({
  selector: 'app-attributedirective',
  templateUrl: './attributedirective.component.html',
  styleUrls: ['./attributedirective.component.css']
})
export class AttributedirectiveComponent {
      myColor: string
      myClass: string
      constructor(){
        this.myColor = "blue"
        this.myClass ="class"
      }
      changeStyle(){
        if( this.myColor == "blue")
          this.myColor = "red"
        else
          this.myColor= "blue"
      }
      changeClassStyle(){
        if(this.myClass == "class")
          this.myClass = "class1"
        else
          this.myClass = "class"
      }
}
