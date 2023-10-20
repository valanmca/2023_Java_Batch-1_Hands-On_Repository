package com.mahesh.core_java_day_03;

public class Arr_Obj {

	int id, sal;
	String name;

	Arr_Obj(int id, String name, int sal) {
		this.id = id;
		this.name = name;
		this.sal = sal;

	}

	void disp() {
System.out.println(id+" "+name+" "+sal);
	}

	public static void main(String[] args) {

		Arr_Obj emp1 = new Arr_Obj(11, "Mahesh", 2000);
		Arr_Obj emp2 = new Arr_Obj(12, "Nagesh", 3000);

		
		Arr_Obj emp[] = new Arr_Obj[2];
		
		
		Arr_Obj EMP[] = new Arr_Obj[2];
		
		emp[0]=emp1; //11, "Mahesh", 2000
		emp[1]=emp2; //12, "Nagesh", 3000
		
		for (int i = 0; i < emp.length; i++) {
			emp[i].disp();
		}
		for (int i = 0; i < EMP.length; i++) {
			EMP[i].disp();//null pointer exception error
		}
	}

}
