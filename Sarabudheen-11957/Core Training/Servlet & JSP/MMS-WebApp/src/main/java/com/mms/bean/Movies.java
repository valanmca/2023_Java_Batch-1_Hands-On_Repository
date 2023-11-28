package com.mms.bean;

public class Movies {

	private int movieId;
	private String movieName;
	private String movieType;
	private String movieLanguage;
	private String movieDuration;

	public Movies() {
		super();
	}



	public Movies(int id, String name, String type, String language, String duration) {
		super();
		movieId = id;
		movieName = name;
		movieType = type;
		movieLanguage = language;
		movieDuration = duration;

	}

	public int getMovie_Id() {
		return movieId;
	}

	public void setMovie_Id(int id) {
		movieId = id;
	}

	public String getMovie_Name() {
		return movieName;
	}

	public void setMovie_Name(String name) {
		movieName = name;
	}

	public String getMovie_Type() {
		return movieType;
	}

	public void setMovie_Type(String type) {
		movieType = type;
	}

	public String getMovie_Language() {
		return movieLanguage;
	}

	public void setMovie_Language(String language) {
		movieLanguage = language;
	}

	public String getMovie_Duration() {
		return movieDuration;
	}

	public void setMovie_Duration(String duration) {
		movieDuration = duration;
	}

}
