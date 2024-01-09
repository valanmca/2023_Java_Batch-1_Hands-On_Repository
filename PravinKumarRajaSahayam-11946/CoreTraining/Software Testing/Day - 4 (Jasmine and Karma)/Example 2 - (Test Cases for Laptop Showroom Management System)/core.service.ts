import { Injectable } from '@angular/core';
import { MatSnackBar } from '@angular/material/snack-bar';

@Injectable({
  providedIn: 'root'
})
export class CoreService {
  snackBar(arg0: string, arg1: string) {
    throw new Error('Method not implemented.');
  }
  constructor(private _snackBar: MatSnackBar) {}

  openSnackBar(message: string, action: string = 'ok') {
    this._snackBar.open(message, action, {
      duration: 40000,
      verticalPosition: 'top',
    });
  }
}