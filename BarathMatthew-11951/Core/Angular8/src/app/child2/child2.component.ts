import { Component } from '@angular/core';

@Component({
  selector: 'app-child2',
  templateUrl: './child2.component.html',
  styleUrls: ['./child2.component.css']
})
export class Child2Component {
    myStyle :{};
    myChange : {};
    myClass : string;

    constructor(){
      this.myStyle = {'color' : 'green','cursor' :'pointer'};
      this.myChange = {'color' : 'red','cursor' :'pointer'};
      this.myClass = "MyClass1";
    }

    setChange(){
      if (this.myStyle!=this.myChange){
        this.myStyle=this.myChange;
      }
      else{
        this.myStyle={'color' : 'green','cursor' :'pointer'};
      }
    }

    setChange1(){
      if(this.myClass=="MyClass1"){
        this.myClass="MyClass2"
      }
      else{
        this.myClass="MyClass1"
      }
    }
}
