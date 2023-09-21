import { Component } from '@angular/core';
import { Hospital } from 'Model/Hospital';
import { HospitalService } from './hospital.service';
import { FormGroup, FormControl, Validators } from '@angular/forms';


@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  hospitalForm:FormGroup
  hospital:Hospital;
  result:string = "";
  hosList:Hospital[] = [];

  constructor(private hosp:HospitalService){
    this.hospital = new Hospital();
    this.getAllPatient();

    this.hospitalForm=new FormGroup({
      id: new FormControl('',[Validators.required,Validators.pattern('[0-9]+')]),
      patientName: new FormControl('',[Validators.required,Validators.pattern('[a-zA-Z]+')]),
      age : new FormControl('',[Validators.required,Validators.pattern('[0-9]+')]),
      bloodGroup : new FormControl('',[Validators.required,Validators.pattern('[a-zA-Z]+')])
    });
    }
    insertPatient(data:any){
        this.hospital.id = data.id;
        this.hospital.patientName = data.patientName;
        this.hospital.age = data.age;
        this.hospital.bloodGroup = data.bloodGroup;

        this.result = this.hosp.InsertPatient(this.hospital);
        this.getAllPatient();
        
  }

  deletePatient(data:any){
    this.hospital.id = data.id;
    this.hospital.patientName = data.patientName;
    this.hospital.age = data.age;
    this.hospital.bloodGroup = data.bloodGroup;

    this.result = this.hosp.DeletePatient(this.hospital);
    this.getAllPatient();
    
}

  updatePatient(data:any){
    this.hospital.id = data.id;
    this.hospital.patientName = data.patientName;
    this.hospital.age = data.age;
    this.hospital.bloodGroup = data.bloodGroup;

    this.result = this.hosp.UpdatePatient(this.hospital);
    this.getAllPatient();
  }

  getAllPatient(){
    this.hosp.getAllPatients().subscribe(
      hospitals => this.hosList = hospitals
    )
  }


}

