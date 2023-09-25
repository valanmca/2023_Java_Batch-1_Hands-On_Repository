import { Component } from '@angular/core';
import { DialogComponent } from './dialog/dialog.component';
import {MatDialog, MAT_DIALOG_DATA, MatDialogModule} from '@angular/material/dialog';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.scss']
})
export class AppComponent {
  title = 'College-Management-System';

  constructor(private dialog : MatDialog){
    }

    openDialog() {
      this.dialog.open(DialogComponent, {
        width :'30%'
      });
    }

  }

