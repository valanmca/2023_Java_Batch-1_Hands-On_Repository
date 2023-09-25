import { Component } from '@angular/core';
import { MatDialog } from '@angular/material/dialog';
import { EmpAddEditComponent } from './emp-add-edit/emp-add-edit.component';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'CrudApp';
  constructor(private _dialogue:MatDialog){
    
  }
  openAddEditEmpForm(){
    this._dialogue.open(EmpAddEditComponent);
  }
}
