import { Component, Inject, OnInit,ViewChild } from '@angular/core';
import { MatDialog,MAT_DIALOG_DATA,MatDialogModule, MatDialogRef } from '@angular/material/dialog';
import { DialogComponent } from './dialog/dialog.component';
import { ApiService } from './services/api.service';
import {MatPaginator, MatPaginatorModule} from '@angular/material/paginator';
import {MatSort, MatSortModule} from '@angular/material/sort';
import {MatTableDataSource, MatTableModule} from '@angular/material/table';
import {MatInputModule} from '@angular/material/input';
import {MatFormFieldModule} from '@angular/material/form-field';



@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.scss']
  
})
export class AppComponent implements OnInit{
  title = 'Angular-CRUD-Material-Project';

  displayedColumns: string[] = ['productName', 'Category', 'date', 'freshness', 'price', 'comment','action'];
  dataSource! : MatTableDataSource<any>;

  @ViewChild(MatPaginator) paginator! : MatPaginator;
  @ViewChild(MatSort) sort! : MatSort;
  constructor(private dialog : MatDialog, private api : ApiService)
   {

  }
  ngOnInit():void{
    this.getAllProduct();
  }
  openDialog() {
    this.dialog.open(DialogComponent, {
     width : '30%'
    }).afterClosed().subscribe(val => {
      if(val === 'Save'){
        this.getAllProduct();
      }
    });
  }
  
  getAllProduct(){
    this.api.getProduct()
    .subscribe({
      next:(res)=>{
        this.dataSource = new MatTableDataSource(res);
        this.dataSource.paginator = this.paginator;
        this.dataSource.sort = this.sort;
      },
      error :(err) =>{
        alert("Error while fetching the records");
      } 
    })
  }
  editProduct(row:any){
    this.dialog.open(DialogComponent,{
      width:'30%', data: row}).afterClosed().subscribe(val=>{
        if ( val == "Update"){
          this.getAllProduct();}
      })
  }
  deleteProduct(id:number){
    this.api.deleteProduct(id).subscribe({
      next:(res)=>{
        alert("Product Deleted Successfully");
        this.getAllProduct();
      },
      error:()=>{
        alert("Error while Delete Product");
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