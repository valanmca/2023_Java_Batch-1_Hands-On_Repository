package com.mms.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tbl_movie")
public class Movie {

	@Id
	@Column(name = "Id")
	private int Id;

	@Column(name = "Name")
	private String Name;

	@Column(name = "Type")
	private String Type;

	@Column(name = "Language")
	private String Language;

	@Column(name = "Duration")
	private String Duration;

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getType() {
		return Type;
	}

	public void setType(String type) {
		Type = type;
	}

	public String getLanguage() {
		return Language;
	}

	public void setLanguage(String language) {
		Language = language;
	}

	public String getDuration() {
		return Duration;
	}

	public void setDuration(String duration) {
		Duration = duration;
	}

	@Override
	public String toString() {
		return "Movie [Id=" + Id + ", Name=" + Name + ", Type=" + Type + ", Language=" + Language + ", Duration="
				+ Duration + "]";
	}

}
