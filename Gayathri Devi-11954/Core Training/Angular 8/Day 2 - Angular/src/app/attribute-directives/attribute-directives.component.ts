import { Component } from '@angular/core';

@Component({
  selector: 'app-attribute-directives',
  templateUrl: './attribute-directives.component.html',
  styleUrls: ['./attribute-directives.component.css']
})
export class AttributeDirectivesComponent {
myColor : string;
myStyle :{};
myClass:string;
myClassChange : string;

constructor(){
  this.myColor="yellow";
  this.myStyle={'color':'blue','font-style':'bold'};
  this.myClass="MyClass1";
  this.myClassChange="MyClass2","MyClass3";
}
changeStyle(){
  this.myStyle={'color':'red','font-style':'italic'};
}
changeColor()
{
  if(this.myColor=="yellow")
      this.myColor="brown";
  else
  this.myColor="yellow";
}
changeClass(){
  if(this.myClassChange=="MyClass2")
        this.myClassChange="MyClass3";
  else
        this.myClassChange="MyClass2";
}
}