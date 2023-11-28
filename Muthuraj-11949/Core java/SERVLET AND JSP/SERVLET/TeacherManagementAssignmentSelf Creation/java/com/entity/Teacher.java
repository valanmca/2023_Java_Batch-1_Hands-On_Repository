package com.entity;
public class Teacher {
	private int id;
	private String name;
	private int experience;
	private String qualification;
	private int contact;
	private String email;
		public Teacher(int id2, String name2, int experience2, String qualification2, int contact2, String email2) {
		// TODO Auto-generated constructor stub
	}
	public Teacher() {
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
	public int getExperience() {
		return experience;
	}
	public void setExperience(int experience) {
		this.experience = experience;
	}
	public String getQualification() {
		return qualification;
	}
	public void setQualification(String qualification) {
		this.qualification = qualification;
	}
	public int getContact() {
		return contact;
	}
	public void setContact(int contact) {
		this.contact = contact;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", experience=" + experience + ", qualification="
				+ qualification + ", contact=" + contact + ", email=" + email + "]";
	}	
}
