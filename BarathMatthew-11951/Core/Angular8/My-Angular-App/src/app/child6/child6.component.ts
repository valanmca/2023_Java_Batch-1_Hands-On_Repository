import { Component } from '@angular/core';

@Component({
  selector: 'app-child6',
  templateUrl: './child6.component.html',
  styleUrls: ['./child6.component.css']
})

  
export class Child6Component {
  
    tname : string ="";
    temail : string ="";
    tphno : number=0;
    tage : number=0;
    flag : boolean=false;
    tcountry : string="";
    myFunction(myForm: any){
      this.tname = myForm.name;
      this.temail = myForm.email;
      this.tphno = myForm.phno;
      this.tage = myForm.age;
      this.tcountry = myForm.country;
    }

    changeFlag(){
      this.flag = true;
    }
}
