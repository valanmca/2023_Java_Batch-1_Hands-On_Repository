import { Component } from '@angular/core';
import { MatDialog } from '@angular/material/dialog';
import { FormComponent } from './form/form.component';



@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css'],
  
})
export class AppComponent {
  title = 'MGSYS';



constructor(private dialogbox : MatDialog)
{

}

openwindow()
{
  this.dialogbox.open(FormComponent);
}

}
