import { Component } from '@angular/core';

import { Movie } from './model/mov';
import { MoviemanageService } from './moviemanage.service';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'movie';
  movie:Movie;
  result:string="";
  movList:Movie[]=[];
  movieList:Movie[]=[];
  flag:boolean=false;
  constructor(private service :MoviemanageService)
  {
    this.movie=new Movie();
    this.getAllDetails();
  }
  changeDiv(){
    this.flag=!this.flag;
  }

  insert(data:any)
  {
    this.movie.id=data.id;
    this.movie.name=data.name;
    this.movie.type=data.type;
    this.movie.language=data.language;
    this.movie.duration=data.duration;
    
    this.result=this.service.insert(this.movie);
    this.getAllDetails();


  }
  update(data:any)
  {
    this.movie.id=data.id;
    this.movie.name=data.name;
    this.movie.type=data.type;
    this.movie.language=data.language;
    this.movie.duration=data.duration;
    this.result=this.service.update(this.movie);
    this.getAllDetails();


  }
  delete(data:any)
  {
    this.movie.id=data.id;
    this.movie.name=data.name;
    this.movie.type=data.type;
    this.movie.language=data.language;
    this.movie.duration=data.duration;

    this.result=this.service.delete(this.movie);
    this.getAllDetails();


  }


  getAllDetails()
  {
    this.service.getAlldetails().subscribe(
      (      movies: Movie[])=>this.movieList=movies
    );


  }
}
