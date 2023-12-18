
import { Component, Inject, OnInit } from '@angular/core';
import { FormGroup, FormControl, Validators } from '@angular/forms';
import { MovieService } from '../movie.service';
import { MatDialogRef, MAT_DIALOG_DATA } from '@angular/material/dialog';
import { SnackbarService } from '../snackbar.service';

@Component({
  selector: 'app-movie',
  templateUrl: './movie.component.html',
  styleUrls: ['./movie.component.scss']
})
export class MovieComponent implements OnInit{

  movieForm:FormGroup;
  movieType = [ 
    'Romance',
    'Thriller',
    'Drama',
    'Action'
  ]
  constructor(private _mov:MovieService, private _dialogRef:MatDialogRef<MovieComponent>,
    @Inject (MAT_DIALOG_DATA) public data:any, private _snackbar: SnackbarService){

    this.movieForm = new FormGroup ({ 
      id: new FormControl('',[Validators.required,Validators.pattern('[0-9]+')]),
      type: new FormControl('',[Validators.required]),
      name: new FormControl('',[Validators.required, Validators.pattern('[a-zA-Z][a-zA-Z\\s]+')]),  
      language: new FormControl('',[Validators.required, Validators.pattern ('[a-zA-Z][a-zA-Z\\s]+')]),
      duration: new FormControl('',[Validators.required,Validators.pattern('[0-9][a-zA-Z]+')]),
    });
  }
  ngOnInit(): void {
      this.movieForm.patchValue(this.data); //To view the existing data when click update
  }

  onSubmit(){
    
    if(this.movieForm.valid){
      if(this.data){// Update Movie
        this._mov.updateMovie(this.data.id,this.movieForm.value).subscribe({
          next:(val) => {
            this._snackbar.openSnackBar("Movie details Updated","Done")
            this._dialogRef.close(true);
          }
        })
      }else{// Add Movie
        this._mov.addMovies(this.movieForm.value).subscribe({
          next: (_val) => {
            this._snackbar.openSnackBar("Movie Added","Done")
            this._dialogRef.close(true);
          }
        });
      }
    
    }
  }
}
