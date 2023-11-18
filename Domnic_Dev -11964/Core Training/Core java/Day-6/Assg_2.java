package Core_Topic_Domnic_Day_6;

class Employee {
	int calculateSalary(int monthsal) {
        return monthsal;
	}
}

class Manager extends Employee {

	int calculateSalary(int monthsal) {
		int totsal = monthsal * 12;
		return totsal;
	}
}

class Programmer extends Employee {


	int calculateSalary(int monthsal) {
		int totsal = monthsal * 12;
		return totsal;
	}
}

public class Assg_2 {

	public static void main(String[] args) {
     Manager obj1=new Manager();
     System.out.println("Manager LPA : "+obj1.calculateSalary(53000));
     
     Programmer obj2=new Programmer();
     System.out.println("Programmer LPA : "+obj2.calculateSalary(27000));

     
	}

}
