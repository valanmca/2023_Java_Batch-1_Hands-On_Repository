//OOPS_Exs_12;.
/*Write a program to implement a class "Student" with the following members.Name of the Student.
 * Marks of the Student obtained in three subject.Functions to assign initial values.Functions to compute total average.
 * Functions to display the student's name and the total marks.Write an appropriate main()
 * Functions to demonstrate the functioning of the abovesss*/
 
package com.pravinkumar.day10;

public class student {

	// Variables
	String sname;
	int smark1;
	int smark2;
	int smark3;

	/*
	 * float average; float total;
	 */

	// Constructors
	student(String sname, int smark1, int smark2, int smark3) {
		this.sname = sname;
		this.smark1 = smark1;
		this.smark2 = smark2;
		this.smark3 = smark3;
		/*
		 * this.average = ((smark1 + smark2 + smark3) / 3); this.total = (smark1 +
		 * smark2 + smark3);
		 */
	}

	int getSum() {
		int sum = smark1 + smark2 + smark3;
		return sum;
	}

	int getAvg() {
		int avg = getSum() / 3;
		return avg;
	}

	String getGrade() {
		String grade = " ";
		if (getAvg() >= 90)
			grade = "A";
		else if (getAvg() >= 60 && getAvg() < 90)
			grade = "B";
		else
			grade = "C";
		return grade;
	}

	// Method
	void details() {
		System.out.println("Name : " + sname);
		System.out.println("Mark1 : " + smark1);
		System.out.println("Mark2 : " + smark2);
		System.out.println("Mark3 : " + smark3);
		/*
		 * System.out.println("Average : " + average);
		 * System.out.println("Total Marks are : " + total);
		 */
		System.out.println("Average : " + getAvg());
		System.out.println("Total Sum is : " + getSum());
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		student obj = new student("PravinKumar", 1, 4, 6);
		obj.details();
	}

}
