package com.sara.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "movies_details")
public class Movies {

	@Id
	@Column(name = "Movie_Id")
	private int id;

	@Column(name = "Movie_Name")
	private String name;

	@Column(name = "Movie_Type")
	private String type;

	@Column(name = "Movie_Language")
	private String language;

	@Column(name = "Movie_Duration")
	private String duration;

	/**
	 * 
	 */
	public Movies() {
		super();
	}

	public Movies(int id, String name, String type, String language, String duration) {
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

	public String getDuration() {
		return duration;
	}

	public void setDuration(String duration) {
		this.duration = duration;
	}

	@Override
	public String toString() {
		return "Your Movie's Deatails \n||Movie id : " + id + "\n|| Movie name :" + name + "\n||Movie type : " + type + "\n||Movie language : " + language + "\n||Movie duration : "
				+ duration +"||";
	}

}
