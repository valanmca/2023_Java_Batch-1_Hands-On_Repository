import { Component } from '@angular/core';
import { Patient } from './model/patient';
import { DataService } from './data.service';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  patients:Patient;
  result:string="";
  //  empList:Employee[]=[];
  patList:Patient[]=[];
  constructor( private service:DataService){
    this.patients=new Patient();


  }
  insert(data:any)
  {
    this.patients.name=data.name;
    this.patients.id=data.id;
    this.patients.address=data.add;
    this.result=this.service.Insert(this.patients);
    this.getAllPatients();

  }
  update(data:any)
  {
    this.patients.name=data.name;
    this.patients.id=data.id;
    this.patients.address=data.add;
    this.result=this.service.Update(this.patients);
    this.getAllPatients();

  }
  delete(data:any)
  {
    this.patients.name=data.name;
    this.patients.id=data.id;
    this.patients.address=data.add;
    this.result=this.service.Delete(this.patients);
    this.getAllPatients();

  }

  getAllPatients()
  {
    // this.service.getAllEmployeeDetails().subscribe( employees=>this.empList=employees);
    this.service. getAllPatient().subscribe(patientss=>this.patList=patientss);
  }

  
}
