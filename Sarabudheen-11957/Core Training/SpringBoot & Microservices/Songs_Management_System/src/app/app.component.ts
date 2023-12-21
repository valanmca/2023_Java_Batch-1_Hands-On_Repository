import { Component } from '@angular/core';
import { Songs } from './model/Songs';
import { SongService } from './song.service';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  songs : Songs;
  result : string=" ";
  songsList : Songs[] = [] ;

  constructor (private service : SongService){
    this.songs = new Songs;
  }

  insertSong(data : any){
    this.songs.id = data.id;
    this.songs.songName = data.songName;
    this.songs.movieName = data.movieName;
    this.songs.singers = data.singers;
    this.songs.lyricist = data.lyricist;
    this.result = this.service.insertSong(this.songs);

    this.getAllSongs();
  }

  updateSong(data : any){
    this.songs.id = data.id;
    this.songs.songName = data.songName;
    this.songs.movieName = data.movieName;
    this.songs.singers = data.singers;
    this.songs.lyricist = data.lyricist;
    this.result = this.service.updateSong(this.songs);

    this.getAllSongs();
  }

  deleteSong(data : any){
    this.songs.id = data.id;
    this.result = this.service.deleteSong(this.songs);

    this.getAllSongs();
  }

  getAllSongs(){
    this.service.getAllSongsDetails().subscribe(songs => this.songsList = songs);
  }
}
