import { Component } from '@angular/core';
import { FormControl, FormGroup, Validators } from '@angular/forms';
import { Movie } from './Model/Movie';
import { MovieService } from './movie.service';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'moviemngs';
  myform:FormGroup;
  movie:Movie;
  result:String="";
  movList:Movie[]=[];
  flag:boolean=true;
  flag1:boolean=false;
  flag2:boolean=false;
  flag3:boolean=true;
  flag4:boolean=false;
  flag5:boolean=false;


  constructor(private mov:MovieService){
    this.myform=new FormGroup({
      movieId:new FormControl ('',[Validators.required,Validators.pattern('[0-9]+')]),
      movieName:new FormControl ('',[Validators.required,Validators.pattern('[a-zA-Z]+')]),
      movieType:new FormControl ('',[Validators.required,Validators.pattern('[a-zA-Z]+')]),
      movieLanguage:new FormControl ('',[Validators.required,Validators.pattern('[a-zA-Z]+')]),
      movieDuration:new FormControl ('',[Validators.required,Validators.pattern('[0-9]+[a-zA-Z]+')]),
    });

    this.movie=new Movie();
    this.getAlldetails();
  }

  insertMovieDetails(data:any){
    this.movie.movieId=data.movieId;
    this.movie.movieName=data.movieName;
    this.movie.movieType=data.movieType;
    this.movie.movieLanguage=data.movieLanguage;
    this.movie.movieDuration=data.movieDuration;
    
    this.result=this.mov.insertdetails(this.movie);
    this.getAlldetails();
  }

  updateMovieDetails(data:any){
    this.movie.movieId=data.movieId;
    this.movie.movieName=data.movieName;
    this.movie.movieType=data.movieType;
    this.movie.movieLanguage=data.movieLanguage;
    this.movie.movieDuration=data.movieDuration;
    
    this.result=this.mov.updatedetails(this.movie);
    this.getAlldetails();
  }

  deleteMovieDetails(data:any){
    this.movie.movieId=data.movieId;
    this.movie.movieName=data.movieName;
    this.movie.movieType=data.movieType;
    this.movie.movieLanguage=data.movieLanguage;
    this.movie.movieDuration=data.movieDuration;
    
    this.result=this.mov.deletedetails(this.movie);
    this.getAlldetails();
   }

  getAlldetails(){
    this.mov.getAllMovieDetails().subscribe(movies => this.movList = movies);
   }

   changediv(){
    this.flag=!this.flag;
    this.flag1=!this.flag1;
    this.flag2=!this.flag2;
    this.flag3=!this.flag3;
  }
  changediv1(){
    this.flag=!this.flag;
    this.flag1=!this.flag1;
    this.flag2=!this.flag2;
    this.flag3=!this.flag3;
  }
  changediv2(){
    this.flag4=!this.flag4;
  }

  

}
