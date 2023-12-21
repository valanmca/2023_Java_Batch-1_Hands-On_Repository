import { Component } from '@angular/core';
import { Patient } from './model/Patient';
import { PatientService } from './patient.service';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
 

  patient:Patient;
  result: string = "";
  patList:Patient[]=[];

  constructor(private service: PatientService) {
    this.patient = new Patient();
    this.getAll();
  }

  insert(data: any) {
   this.patient.id=data.id;
   this.patient.name=data.name;
   this.patient.age=data.age;
   this.patient.email=data.email;
   this.patient.bgroup=data.bgroup;
   this.patient.location=data.location;

    this.result = this.service.insertDetail(this.patient);
    this.getAll();
  }

  update(data: any) {
    
    this.patient.id=data.id;
   this.patient.name=data.name;
   this.patient.age=data.age;
   this.patient.email=data.email;
   this.patient.bgroup=data.bgroup;
   this.patient.location=data.location;

    this.result = this.service.updateDetail(this.patient);
    this.getAll();
  }

  delete(data:any)
  {
    this.patient.id=data.id;
    this.result=this.service.deleteDetail(this.patient);
    this. getAll();
  }

  getAll()
  {
    this.service.getAlldetails().subscribe(patients =>this.patList=patients)
  }
}
