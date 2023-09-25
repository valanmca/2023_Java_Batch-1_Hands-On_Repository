import { Component } from '@angular/core';
import { details } from './model/details';
import { DataService } from './dataservice.service';





@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'patientManage';
  patient:details;
  result:string="";
  stuList:details[]=[];
  patientList:details[]=[];
  flag:boolean=false;
studentList: any;
  constructor(private service :DataService)
  {
    this.patient=new details();
    this.getAllDetails();
  }
  changeDiv(){
    this.flag=!this.flag;
  }




  insert(data:any)
  {
    this.patient.id=data.id;
    this.patient.patient_name=data.name;
    this.patient.dob=data.dob;
    this.patient.gender=data.gender;
    this.patient.address=data.depart;
    this.result=this.service.insert(this.patient);
    this.getAllDetails();




  }
  update(data:any)
  {
    this.patient.id=data.id;
    this.patient.patient_name=data.name;
    this.patient.dob=data.dob;
    this.patient.gender=data.gender;
    this.patient.address=data.depart;
    this.result=this.service.update(this.patient);
    this.getAllDetails();




  }
  delete(data:any)
  {
    this.patient.id=data.id;
    this.patient.patient_name=data.name;
    this.patient.dob=data.dob;
    this.patient.gender=data.gender;
    this.patient.address=data.depart;
    this.result=this.service.delete(this.patient);
    this.getAllDetails();




  }




  getAllDetails()
  {
    this.service.getAlldetails().subscribe(
      (      patients: details[])=>this.patientList=patients
    );




  }
  // getAllDetail()
  // {
  // this.service.getAlldetails().subscribe(
  //   patients=>this.stuList=patients
  //    );




  }
  // insert(data:any)
  // {
 
  //  alert(data.id+" "+data.name+" "+data.dob+" "+data.gender+" "+data.depart+" ");
  // }


