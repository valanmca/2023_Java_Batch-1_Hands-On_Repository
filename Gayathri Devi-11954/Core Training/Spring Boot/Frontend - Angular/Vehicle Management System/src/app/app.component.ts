import { Component, OnInit } from '@angular/core';
import { VechicleService } from './vechicle.service';
import { MatDialog } from '@angular/material/dialog';
import { VechicleComponent } from './vechicle/vechicle.component';
import { MatTableDataSource } from '@angular/material/table';
import { SnackbarService } from './snackbar.service';
import {MatPaginatorModule} from '@angular/material/paginator';
@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent implements OnInit{
  [x: string]: any;

  displayedColumns: string[] = ['id', 'type', 'name', 'number','owner','action'];
  dataSource!: MatTableDataSource<any>

  constructor(private _vec:VechicleService, private _dialog:MatDialog, private _snackbar: SnackbarService){}

  ngOnInit(): void {
      this.getVehicle(); //To get the values
  }

  addVehicle(){
    const dialogRef = this._dialog.open(VechicleComponent);
    dialogRef.afterClosed().subscribe({
      next: (val) => {
        if(val){
          this.getVehicle();
        }
      },
      error: console.log
    });
  }

  getVehicle(){
    this._vec.getAllVechiles().subscribe({
      next: (res) => {
        this.dataSource = new MatTableDataSource(res);
      }
    });
  }

  deleteVehicle(id:number){
    this._vec.deleteVehicles(id).subscribe({
      next: (res) => {
        this._snackbar.openSnackBar("Record Deleted", "Done"); //Delete Vehicle
        this.getVehicle();
      }
    });
  }

  updateVehicle(data:any){
    const dialogRef = this._dialog.open(VechicleComponent,{
      data,
    });
    dialogRef.afterClosed().subscribe({
      next: (val) => {
        if(val){
          this.getVehicle();
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
