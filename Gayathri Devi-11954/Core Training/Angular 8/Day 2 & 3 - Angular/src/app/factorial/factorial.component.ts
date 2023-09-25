import { Component } from '@angular/core';

@Component({
  selector: 'app-factorial',
  templateUrl: './factorial.component.html',
  styleUrls: ['./factorial.component.css']
})
export class FactorialComponent {

  // fact(a:number){
  //   let i =1;
  //   let fact = 1;
  //   for(i=1;i<=a;i++){
  //     fact = fact*i;
  //   }
  //   return fact;  }
  // num : number[];
  // selectednum : number=1;
  // constructor(){  
  //   this.num = [1,2,3,4,5,6,7,8,9,10];
  // }
 
  
  // setSelectednum(selectednum : number){
  // this.selectednum = selectednum;
  // }

  
  findfactnumber : number[];
  selectedFactNumber: number | undefined;
  constructor(){
    
    this.findfactnumber = [0,1,2,3,4,5,6,7,8,9,10];
  }
  
  setFactorial(selectedFactNumber : number){
    let i =1;
   let fact = 1;
   for(i=1;i<=selectedFactNumber;i++){
   fact = fact*i;
  }
  
  
  this.selectedFactNumber = fact;
  }
// valan code
  getFactorial(selectedFactNumber : number){
    let i =1;
   let fact = 1;
   for(i=1;i<=selectedFactNumber;i++){
   fact = fact*i;
  }
   
  return fact;
  }
}
