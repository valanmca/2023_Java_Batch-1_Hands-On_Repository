package integers;

class Employee {
	private int id;
	private String firstName;
	private String lastName;
	private int salary;

	Employee(int id, String firstName, String lastName, int salary) {
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.salary = salary;
	}

	public int getId() {
		return id;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public String getName() {
		String name = firstName + lastName;
		return name;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	public int getAnnualSalary() {
		int annualSalary = salary*12;
		return annualSalary;
	}
	
	public double raiseSalary(int percent) {
		double raiseSalary = (((percent * salary) /100) + salary);
		return raiseSalary;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName +", Name =" + getName() 
			+", salary=" + getSalary()+ ", AnnualSalary="+ getAnnualSalary() + "]";
	}

	
}

public class assign_02 {

	public static void main(String[] args) {
		 Employee employee = new Employee(11966,"Hephzibah","S",20000);
		 System.out.println(employee.toString());
		 System.out.println(employee.raiseSalary(10));
	}

}
