import { Component, OnInit, ViewChild} from '@angular/core';
import {MatDialog, MAT_DIALOG_DATA, MatDialogModule} from '@angular/material/dialog';
import { DialogComponent } from './dialog/dialog.component';
import { ApiService } from './services/api.service';
import {MatPaginator, MatPaginatorModule} from '@angular/material/paginator';
import {MatSort, MatSortModule} from '@angular/material/sort';
import {MatTableDataSource, MatTableModule} from '@angular/material/table';


@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.scss']
})
export class AppComponent implements OnInit {
  title = 'Angular13crud';


  displayedColumns: string[] = ['id', 'name', 'email', 'contact', 'location', 'action'];
  dataSource!: MatTableDataSource<any>;


  @ViewChild(MatPaginator) paginator!: MatPaginator;
  @ViewChild(MatSort) sort!: MatSort;


  constructor(private dialog : MatDialog, private api : ApiService){


  }
  ngOnInit():void{
    this.getAllCustomers();
  }
  openDialog() {
    this.dialog.open(DialogComponent, {
      width: '30%'
    }).afterClosed().subscribe(val=>
      {
        if(val=== 'save'){
          this.getAllCustomers();
        }
      })
  }
  getAllCustomers(){
    this.api.getCustomer()
    .subscribe({
      next:(res)=>{
        this.dataSource = new MatTableDataSource(res);
        this.dataSource.paginator = this.paginator;
        this.dataSource.sort = this.sort;
      },
      error:(err)=>{
        alert("Error while fetching the Records!!")
      }
    })
  }
  editCustomer(row : any){
    this.dialog.open(DialogComponent,{
      width : '30%',
      data:row
    }).afterClosed().subscribe(val=>
      {
        if(val=== 'update'){
          this.getAllCustomers();
        }
      })
  }


  deleteCustomer(data:any){
    this.api.deleteCustomer(data)
    .subscribe({
      next:(res)=>{
        alert("Customer Deleted Successfully");
        this.getAllCustomers();
      },
      error:()=>{
        alert('Unable to Delete Customer');
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


