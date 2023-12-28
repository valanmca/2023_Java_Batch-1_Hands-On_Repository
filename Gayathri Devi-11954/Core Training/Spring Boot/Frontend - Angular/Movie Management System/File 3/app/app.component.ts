import { Component, OnInit, ViewChild } from '@angular/core';
import { MovieService } from './movie.service';
import { MatDialog } from '@angular/material/dialog';
import { MovieComponent } from './movie/movie.component';
import { MatTableDataSource } from '@angular/material/table';
import { SnackbarService } from './snackbar.service';
import {MatPaginator, MatPaginatorModule} from '@angular/material/paginator';
import {MatSort, MatSortModule} from '@angular/material/sort';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.scss']
})
export class AppComponent implements OnInit{
  
  displayedColumns: string[] = ['id', 'name', 'type', 'language','duration','action'];
  dataSource!: MatTableDataSource<any>

  @ViewChild(MatPaginator) paginator!: MatPaginator;
  @ViewChild(MatSort) sort!: MatSort;

  constructor(private _mov:MovieService, private _dialog:MatDialog, private _snackbar: SnackbarService){}

  ngOnInit(): void {
      this.getMovie(); //To get the values
  }

  addMovie(){
    const dialogRef = this._dialog.open(MovieComponent);
    dialogRef.afterClosed().subscribe({
      next: (val) => {
        if(val){
          this.getMovie();
        }
      },
      error: console.log
    });
  }

  getMovie(){
    this._mov.getAllMovies().subscribe({
      next: (res) => {
        this.dataSource = new MatTableDataSource(res);
      }
    });
  }

  deleteMovie(id:number){
    this._mov.deleteMovies(id).subscribe({
      next: (res) => {
        this._snackbar.openSnackBar("Record Deleted", "Done"); //Delete Movie
        this.getMovie();
      }
    });
  }

  updateMovie(data:any){
    const dialogRef = this._dialog.open(MovieComponent,{
      data,
    });
    dialogRef.afterClosed().subscribe({
      next: (val) => {
        if(val){
          this.getMovie();
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
