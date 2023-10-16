package com.naveen.day2_1;

import java.util.ArrayList;
import java.util.List;

class School {
    private List<String> students;
    private List<String> teachers;
    private List<String> classes;

    public School() {
        students = new ArrayList<>();
        teachers = new ArrayList<>();
        classes = new ArrayList<>();
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

    public void addClass(String className) {
        classes.add(className);
    }

    public void removeClass(String className) {
        classes.remove(className);
    }

    public List<String> getStudents() {
        return students;
    }

    public List<String> getTeachers() {
        return teachers;
    }

    public List<String> getClasses() {
        return classes;
    }
}

public class Ex05_Student {
    public static void main(String[] args) {
        School school = new School();
        school.addStudent("John");
        school.addStudent("Alice");
        school.addTeacher("Mr. Smith");
        school.addClass("Math");

        System.out.println("Students: " + school.getStudents());
        System.out.println("Teachers: " + school.getTeachers());
        System.out.println("Classes: " + school.getClasses());

        school.removeStudent("Alice");
        school.removeTeacher("Mr. Smith");
        school.removeClass("Math");

        System.out.println("After removal:");
        System.out.println("Students: " + school.getStudents());
        System.out.println("Teachers: " + school.getTeachers());
        System.out.println("Classes: " + school.getClasses());
    }
}
