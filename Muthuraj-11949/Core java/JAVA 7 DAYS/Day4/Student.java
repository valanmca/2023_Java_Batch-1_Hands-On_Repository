package Day4;

import java.util.ArrayList;

import java.util.List;

class School {
 private List<String> students;
 private List<String> teachers;
 private List<String> classes;

 public School() {
 this.students = new ArrayList<>();
 this.teachers = new ArrayList<>();
 this.classes = new ArrayList<>();
 }

 public void addStudent(String studentName) {
 students.add(studentName);
 }

 public void removeStudent(String studentName) {
 students.remove(studentName);
 }

 public void addTeacher(String teacherName) {
 teachers.add(teacherName);
 }

 public void removeTeacher(String teacherName) {
 teachers.remove(teacherName);
 }

 public void createClass(String className) {
 classes.add(className);
 }

 public void displaySchoolInfo() {
 System.out.println("Students: " + students);
 System.out.println("Teachers: " + teachers);
 System.out.println("Classes: " + classes);
 }
}

public class Student {
 public static void main(String[] args) {
 School school = new School();

 school.addStudent("Alice");
 school.addStudent("Bob");
 school.addTeacher("Mr. Smith");
 school.createClass("Math Class");

 school.displaySchoolInfo();

 school.removeStudent("Alice");
 school.removeTeacher("Mr. Smith");

 System.out.println("After removing student and teacher:");
 school.displaySchoolInfo();
 }
}
 