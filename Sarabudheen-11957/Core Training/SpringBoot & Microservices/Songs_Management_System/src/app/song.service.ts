import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Songs } from './model/Songs';

@Injectable({
  providedIn: 'root'
})
export class SongService {

  private url : string="http://localhost:8987"
  constructor(private http:HttpClient) { }

  insertSong(songs : Songs){
    this.http.post(this.url + "/PerformInsert",songs).subscribe();
    return "Record Inserted";
  }

  updateSong(songs : Songs){
    this.http.put(this.url + "/PerformUpdate",songs).subscribe();
    return "Record Updated";
  }

  deleteSong(songs : Songs){
    this.http.delete(this.url + "/PerformDelete/"+songs.id).subscribe();
    return "Record Deleted";
  }

  getAllSongsDetails(){
    return this.http.get<Songs[]>(this.url+"/ViewAll");
  }
}
