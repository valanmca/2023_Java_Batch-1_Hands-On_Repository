import { Component } from '@angular/core';

@Component({
  selector: 'app-child2',
  templateUrl: './child2.component.html',
  styleUrls: ['./child2.component.css']
})
export class Child2Component {
  myStyle: {};
  mychange: {};
  myClass:string;

  


  constructor(){
    this.myStyle={'color':'red', 'cursor':'pointer'};
    this.mychange={'color': 'green','curser':'pointer'};
    this.myClass=" myClass1";
  }
  setchange(){
     if(this.myStyle!= this.mychange){
      this.myStyle= this.mychange;
     }else{
      this.myStyle={'color':'red', 'cursor':'pointer'}
     }

}
setChange2(){
  if(this.myClass=="myClass1"){
 this.myClass="myClass2";   
}else{
  this.myClass="myClass1";
}
}
}

