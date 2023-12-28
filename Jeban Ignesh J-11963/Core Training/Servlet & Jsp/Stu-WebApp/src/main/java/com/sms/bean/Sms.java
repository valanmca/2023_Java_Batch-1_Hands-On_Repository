package com.sms.bean;

public class Sms {

	private int Rollno;
	private String Studentname;
	private String Studentemail;
	private String Section;

	public Sms() {
			super();
			// TODO Auto-generated constructor stub
		}

	public Sms(int rollno, String studentname, String studentemail, String section) {
			super();
			Rollno = rollno;
			Studentname = studentname;
			Studentemail = studentemail;
			Section = section;
		}

	public int getRollno() {
		return Rollno;
	}

	public void setRollno(int rollno) {
		Rollno = rollno;
	}

	public String getStudentname() {
		return Studentname;
	}

	public void setStudentname(String studentname) {
		Studentname = studentname;
	}

	public String getStudentemail() {
		return Studentemail;
	}

	public void setStudentemail(String studentemail) {
		Studentemail = studentemail;
	}

	public String getSection() {
		return Section;
	}

	public void setSection(String section) {
		Section = section;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
