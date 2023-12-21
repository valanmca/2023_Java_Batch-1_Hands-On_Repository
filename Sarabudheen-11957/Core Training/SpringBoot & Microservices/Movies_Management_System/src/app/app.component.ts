import { Component } from '@angular/core';
import { MoviesService } from './movies.service';
import { Movies } from './model/Movies';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {

  movies : Movies;
  result : string=" ";

  constructor (private service : MoviesService){
    this.movies = new Movies;

  }
}

 