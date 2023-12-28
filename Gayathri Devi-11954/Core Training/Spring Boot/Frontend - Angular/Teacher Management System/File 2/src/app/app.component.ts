import { Component, Inject, OnInit,ViewChild } from '@angular/core';
import { MatDialog,MAT_DIALOG_DATA,MatDialogModule, MatDialogRef } from '@angular/material/dialog';
import { DialogComponent } from './dialog/dialog.component';
import { TMSServiceService } from './Services/tms-service.service'
import {MatPaginator, MatPaginatorModule} from '@angular/material/paginator';
import {MatSort, MatSortModule} from '@angular/material/sort';
import {MatTableDataSource, MatTableModule} from '@angular/material/table';



@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
  
})
export class AppComponent implements OnInit{
  title = 'SB-TMS';

  displayedColumns: string[] = ['id', 'name', 'gender', 'email', 'qualification', 'subject','phone','action'];
  dataSource! : MatTableDataSource<any>;

  @ViewChild(MatPaginator) paginator! : MatPaginator;
  @ViewChild(MatSort) sort! : MatSort;
  constructor(private dialog : MatDialog, private api : TMSServiceService)
   {

  }
  ngOnInit():void{
    this.getAllTeacher();
  }
  openDialog() {
    this.dialog.open(DialogComponent, {
     width : '30%'
    }).afterClosed().subscribe(val => {
      if(val === 'Save'){
        this.getAllTeacher();
      }
    });
  }
  
  getAllTeacher(){
    this.api.getTeacher()
    .subscribe({
      next:()=>{
        this.dataSource = new MatTableDataSource();
        this.dataSource.paginator = this.paginator;
        this.dataSource.sort = this.sort;
      },
      error :() =>{
        alert("Error while fetching the records");
      } 
    })
  }
  editTeacher(row:any){
    this.dialog.open(DialogComponent,{
      width:'30%', data: row}).afterClosed().subscribe(val=>{
        if ( val == "Update"){
          this.getAllTeacher();}
      })
  }
  deleteTeacher(id:number){
    this.api.deleteTeacher(id).subscribe({
      next:()=>{
        alert("Teacher Deleted Successfully");
        this.getAllTeacher();
      },
      error:()=>{
        alert("Error while Delete Teacher");
      }
    })
  }
  applyFilter(event: Event) {
    const filterValue = (event.target as HTMLInputElement).value;
    this.dataSource.filter = filterValue.trim().toLowerCase();

    if (this.dataSource.paginator) {
      this.dataSource.paginator.firstPage();
    }
  }
}