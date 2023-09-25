import { Component } from '@angular/core';
import { FormControl, FormGroup, Validators } from '@angular/forms';
import { Patient } from '../model/patient';
import { PatientService } from '../patient.service';

@Component({
  selector: 'app-form-data',
  templateUrl: './form-data.component.html',
  styleUrls: ['./form-data.component.css']
})
export class FormDataComponent {

  
  P_details: FormGroup;
  patient: Patient;
  result:string="";

  constructor(private patientsobj: PatientService) {
    this.P_details = new FormGroup({
      id: new FormControl('', Validators.required),
      name: new FormControl('', Validators.required),
      age: new FormControl('', Validators.required)
    })
    this.patient = new Patient();
  }


  insertdata(data: any) {
    this.patient.id= data.id;
    this.patient.name = data.name;
    this.patient.age = data.age;
    this.result=this.patientsobj.insertpatientdetails(this.patient);

  }

  updatedata(data: any) {
    this.patient.id= data.id;
    this.patient.name = data.name;
    this.patient.age = data.age;
    this.result=this.patientsobj.updatepatientdetails(this.patient);

  }

  deletedata(data: any) {
    this.patient.id= data.id;
    this.patient.name = data.name;
    this.patient.age = data.age;
    this.result=this.patientsobj.deletepatientdetails(this.patient);

  }
  message(data:any)
  {
    
  }



}
