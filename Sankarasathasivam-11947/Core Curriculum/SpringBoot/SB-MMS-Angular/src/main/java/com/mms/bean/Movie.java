package com.mms.bean;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

// Movie Id, Movie Name, Movie Type, Movie Language and Movie Durations.

@Entity
@Table(name = "tbl_movie")
public class Movie {
	@Id
	@Column(name = "mid")
	private int id;
	
	@Column(name = "mname")
	private String name;
	
	@Column(name = "mtype")
	private String type;
	
	@Column(name = "mlanguage")
	private String language;
	
	@Column(name = "mduration")
	private float duration;

	public Movie() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Movie(int id, String name, String type, String language, float duration) {
		super();
		this.id = id;
		this.name = name;
		this.type = type;
		this.language = language;
		this.duration = duration;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public float getDuration() {
		return duration;
	}

	public void setDuration(float duration) {
		this.duration = duration;
	}

}
