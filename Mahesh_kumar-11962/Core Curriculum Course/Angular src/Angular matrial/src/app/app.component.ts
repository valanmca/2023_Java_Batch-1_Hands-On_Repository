import { Component } from '@angular/core';
import { FormControl, FormGroup, Validators } from '@angular/forms';
import { PatientService } from './patient.service';
import { Patient } from './model/patient';
import { MatDialog } from '@angular/material/dialog';
import { FormDataComponent } from './form-data/form-data.component';


@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {



constructor( private _dialogwindow : MatDialog)
{

}
open_window()
{
  this._dialogwindow.open(FormDataComponent);
}
}



