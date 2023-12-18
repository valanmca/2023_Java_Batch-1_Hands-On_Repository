package com.movie.bean;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tbl_MMS")
public class MovieCRUD {
	
	@Id
	@Column(name="id")
	private int id;
	
	@Column(name="name")
	private String name;
	
	@Column(name="type")
	private String type;
	
	@Column(name="language")
	private String language;
	
	@Column(name="duration")
	private String duration;

	public MovieCRUD(int id, String name, String type, String language, String duration) {
		super();
		this.id = id;
		this.name = name;
		this.type = type;
		this.language = language;
		this.duration = duration;
	}

	public MovieCRUD() {
		super();
		// TODO Auto-generated constructor stub
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

	public String getDuration() {
		return duration;
	}

	public void setDuration(String duration) {
		this.duration = duration;
	}

	@Override
	public String toString() {
		return "MovieCRUD [id=" + id + ", name=" + name + ", type=" + type + ", language=" + language + ", duration="
				+ duration + "]";
	}

}
