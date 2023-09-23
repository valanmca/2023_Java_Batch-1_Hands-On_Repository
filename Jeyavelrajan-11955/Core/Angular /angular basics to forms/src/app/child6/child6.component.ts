import { Component } from '@angular/core';

@Component({
  selector: 'app-child6',
  templateUrl: './child6.component.html',
  styleUrls: ['./child6.component.css']
})
export class Child6Component {

//Template Driven Forms
  // myFunction(myForm: any){
  //   alert(myForm.name+""+myForm.email+""+myForm.phoneno+""+myForm.age+""+myForm.country);
  // }
 tname:string = '';
 temail: string = '';
 tphoneno: number =0;
 tage:number = 0;
 tcountry: string ='';

 //to display values within the page 
 flag: boolean;
 
 constructor(){
  this.flag=false;
 }
 changeFlag(){
  this.flag = ! this.flag;
}

 myFunction(myForm:any){
 this.tname = myForm.name;
 this.temail= myForm.email;
 this.tage = myForm.age;
 this.tphoneno= myForm.phoneno;
 this.tcountry = myForm.country;
 }

}
