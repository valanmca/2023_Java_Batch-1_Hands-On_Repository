package Day_4;

import java.util.ArrayList;
import java.util.Scanner;

class student{
	ArrayList<String> coll_student=new ArrayList <String>();
	
	void add_student(String name){
		coll_student.add(name);
	}
	
	void remove_student(String name) {
		coll_student.remove(name);
	}
	
	void display_students() {
		System.out.println(coll_student);
	}
}

class teacher{
	ArrayList<String> coll_teacher=new ArrayList <String>();
	
	void add_teacher(String name){
		coll_teacher.add(name);
	}
	
	void remove_teacher(String name) {
		coll_teacher.remove(name);
	}
	
	void display_teacher() {
		System.out.println(coll_teacher);
	}
}

public class school {
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		student stud = new student();
		teacher tech = new teacher();
		String value ;
		int process =1;
		while (process ==1) {
			System.out.println("Hi what field you want to edit or view 'stu' for 'Student' or 'tech' 'Teacher'");
			value = sc.next();
			System.out.println(value);
			if (value.equals("stu")) {
				System.out.println("Type 'add' to add , 'remove' to remove , 'view' to view");
				String oper = sc.next();
				if (oper.equals("add")) {
					System.out.println("Enter the no students you want to add :");
					int no_stu = sc.nextInt();
					for(int i =0;i<no_stu;i++) {
						System.out.println("Enter the name :");
						String name = sc.next();
						stud.add_student(name);
					}
					stud.display_students();
				}
				else if (oper.equals("remove")) {
					System.out.println("Enter the name :");
					String name = sc.next();
					stud.remove_student(name);
					stud.display_students();
				}
				
				else if (oper.equals("view")) {
					stud.display_students();
				}
			}
			
			else if (value.equals("tech")) {
				System.out.println("Type 'add' to add , 'remove' to remove , 'view' to view");
				String oper = sc.next();
				if (oper.equals("add")) {
					System.out.println("Enter the no teacher you want to add :");
					int no_stu = sc.nextInt();
					for(int i =0;i<no_stu;i++) {
						System.out.println("Enter the name :");
						String name = sc.next();
						tech.add_teacher(name);
					}
					tech.display_teacher();
				}
				else if (oper.equals("remove")) {
					System.out.println("Enter the name :");
					String name = sc.next();
					tech.remove_teacher(name);
					tech.display_teacher();
				}
				
				else if (oper.equals("view")) {
					tech.display_teacher();
				}
			}
			else {
				System.out.println("wrong"+value);
			}
			System.out.println("Do you want to continue : 'y' or 'n'");
			String work = sc.next();
			if(work.equals("n")) {
				process =0;
			}
		}
		
	}

}
