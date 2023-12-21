package com.sms.bean;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Songs_Details")
public class Songs {

	@Id
	@Column(name = "Song_Id")
	private int id;
	
	@Column(name = "Song_Name")
	private String songName;
	
	@Column(name = "Movie_Name")
	private String movieName;
	
	@Column(name = "Singers")
	private String singers;
	
	@Column(name = "Lyricist")
	private String lyricist;
	
	@Column(name = "Music_Director")
	private String musicDirector;

	public Songs() {
		super();
	}

	public Songs(int id, String songName, String movieName, String singers, String lyricist,String musicDirector) {
		super();
		this.id = id;
		this.songName = songName;
		this.movieName = movieName;
		this.singers = singers;
		this.lyricist = lyricist;
		this.musicDirector = musicDirector;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getSongName() {
		return songName;
	}

	public void setSongName(String songName) {
		this.songName = songName;
	}

	public String getMovieName() {
		return movieName;
	}

	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}

	public String getSingers() {
		return singers;
	}

	public void setSingers(String singers) {
		this.singers = singers;
	}

	public String getLyricist() {
		return lyricist;
	}

	public void setLyricist(String lyricist) {
		this.lyricist = lyricist;
	}
	
	

	public String getMusicDirector() {
		return musicDirector;
	}

	public void setMusicDirector(String musicDirector) {
		this.musicDirector = musicDirector;
	}

	@Override
	public String toString() {
		return "Songs [id=" + id + ", songName=" + songName + ", movieName=" + movieName + ", singers=" + singers
				+ ", lyricist=" + lyricist + ", musicDirector=" + musicDirector + "]";
	}

	
	
	
	
	
	
}
