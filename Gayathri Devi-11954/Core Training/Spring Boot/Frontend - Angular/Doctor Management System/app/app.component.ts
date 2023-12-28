import { Component, OnInit, ViewChild } from '@angular/core';
import { MatDialog } from '@angular/material/dialog';
import { MatTableDataSource } from '@angular/material/table';
import { SnackbarService } from './snackbar.service';
import {MatPaginator, MatPaginatorModule} from '@angular/material/paginator';
import {MatSort, MatSortModule} from '@angular/material/sort';
import { DoctorComponent } from './doctor/doctor.component';
import { DoctorService } from './doctor.service';


@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.scss']
})
export class AppComponent implements OnInit{
 
  title = 'SB-DMS';


  
  displayedColumns: string[] = ['id', 'name', 'age', 'email','special','contact','location','action'];
  dataSource!: MatTableDataSource<any>
  @ViewChild(MatPaginator) paginator! : MatPaginator;
  @ViewChild(MatSort) sort! : MatSort;

  constructor(private _mov:DoctorService, private _dialog:MatDialog, private _snackbar: SnackbarService){}

  ngOnInit(): void {
      this.getDoctor(); //To get the values
  }

  addDoctor(){
    const dialogRef = this._dialog.open(DoctorComponent);
    dialogRef.afterClosed().subscribe({
      next: (val) => {
        if(val){
          this.getDoctor();
        }
      },
      error: console.log
    });
  }

  getDoctor(){
    this._mov.getAllDoctors().subscribe({
      next: (res) => {
        this.dataSource = new MatTableDataSource(res);
      }
    });
  }

  deleteDoctor(id:number){
    this._mov.deleteDoctors(id).subscribe({
      next: (res) => {
        this._snackbar.openSnackBar("Record Deleted", "Done"); //Delete Doctor
        this.getDoctor();
      }
    });
  }

  updateDoctor(data:any){
    const dialogRef = this._dialog.open(DoctorComponent,{
      data,
    });
    dialogRef.afterClosed().subscribe({
      next: (val) => {
        if(val){
          this.getDoctor();
        }
      },
      error: console.log
    });
  }

  applyFilter(event: Event) {
    const filterValue = (event.target as HTMLInputElement).value;
    this.dataSource.filter = filterValue.trim().toLowerCase();

    if (this.dataSource.paginator) {
      this.dataSource.paginator.firstPage();
    }
  }

}