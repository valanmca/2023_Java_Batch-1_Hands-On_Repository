import { Component, OnInit } from '@angular/core';
import { MatTableDataSource } from '@angular/material/table';
import { MobileService } from './mobile.service';
import { MatDialog } from '@angular/material/dialog';
import { SnackbarService } from './snackbar.service';
import { MobileComponent } from './mobile/mobile.component';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent implements OnInit {
  title = 'MobileManagement';

  
  displayedColumns: string[] = ['id', 'brand', 'model', 'price','action'];
  dataSource!: MatTableDataSource<any>

  constructor(private _mob:MobileService, private _dialog:MatDialog, private _snackbar: SnackbarService){}

  ngOnInit(): void {
      this.getMobile(); //To get the values
  }

  addMobile(){
    const dialogRef = this._dialog.open(MobileComponent);
    dialogRef.afterClosed().subscribe({
      next: (val) => {
        if(val){
          this.getMobile();
        }
      },
      error: console.log
    });
  }

  getMobile(){
    this._mob.getAllMobile().subscribe({
      next: (res) => {
        this.dataSource = new MatTableDataSource(res);
      }
    });
  }

  deleteMobile(id:number){
    this._mob.deleteMobiles(id).subscribe({
      next: (res) => {
        this._snackbar.openSnackBar("Record Deleted", "Done"); //Delete Mobile
        this.getMobile();
      }
    });
  }

  updateMobile(data:any){
    const dialogRef = this._dialog.open(MobileComponent,{
      data,
    });
    dialogRef.afterClosed().subscribe({
      next: (val) => {
        if(val){
          this.getMobile();
        }
      },
      error: console.log
    });
  }
}
