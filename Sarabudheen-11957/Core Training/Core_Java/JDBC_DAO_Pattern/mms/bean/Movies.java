package com.mms.bean;

public class Movies {

	private int Movie_Id;
	private String Movie_Name;
	private String Movie_Type;
	private String Movie_Language;
	private String Movie_Duration;

	public Movies() {
		super();
	}

	public Movies(int id, String name, String type, String language, String duration) {
		super();
		Movie_Id = id;
		Movie_Name = name;
		Movie_Type = type;
		Movie_Language = language;
		Movie_Duration = duration;

	}

	public int getMovie_Id() {
		return Movie_Id;
	}

	public void setMovie_Id(int id) {
		Movie_Id = id;
	}

	public String getMovie_Name() {
		return Movie_Name;
	}

	public void setMovie_Name(String name) {
		Movie_Name = name;
	}

	public String getMovie_Type() {
		return Movie_Type;
	}

	public void setMovie_Type(String type) {
		Movie_Type = type;
	}

	public String getMovie_Language() {
		return Movie_Language;
	}

	public void setMovie_Language(String language) {
		Movie_Language = language;
	}

	public String getMovie_Duration() {
		return Movie_Duration;
	}

	public void setMovie_Duration(String duration) {
		Movie_Duration = duration;
	}

	// Method to display Movie Details
	public void displayMovies() {
		System.out.println("Movie ID is : " + Movie_Id);
		System.out.println("Movie Name is : " + Movie_Name);
		System.out.println("Movie Type is : " + Movie_Type);
		System.out.println("Movie Language is : " + Movie_Language);
		System.out.println("Movie Duration is : " + Movie_Duration);
		System.out.println("=============================================");

	}

}
