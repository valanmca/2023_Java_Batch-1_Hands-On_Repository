import { Component } from '@angular/core';
import { FormControl, FormGroup, Validators } from '@angular/forms';
import { College } from './model/College';
import { CollegemgsService } from './collegemgs.service';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'college';

  myform:FormGroup;
  college:College;
  result:string="";
  clgList:College[]=[];

  constructor(private clg:CollegemgsService){
    this.myform=new FormGroup({
      id: new FormControl ('',[Validators.required,Validators.pattern('[0-9]+')]),
      name:new FormControl('',[Validators.required,Validators.pattern('[A-Za-z]+')])
    });
    this.college=new College();
  }

  insertdetails(data:any){
    this.college.id=data.id;
    this.college.name=data.name;

    this.result=this.clg.insertdetails(this.college);
    this.getAll();
  }

  getAll(){
    this.clg.getAllDetails().subscribe(colleges => this.clgList=colleges);
  }

  updatedetails(data:any){
    this.college.id=data.id;
    this.college.name=data.name;

    this.result=this.clg.updatedetails(this.college);
    this.getAll();
  }

  deletedetails(data:any){
    this.college.id=data.id;
    this.college.name=data.name;

    this.result=this.clg.deletedetails(this.college);
    this.getAll();
  }
}
