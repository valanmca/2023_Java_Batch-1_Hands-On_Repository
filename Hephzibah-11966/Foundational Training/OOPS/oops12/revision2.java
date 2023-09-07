package oops12;

//Java Bean
class Employee1 {
	private int eid;
	private String ename;
	private float esalary;

	public Employee1(int eid, String ename, float esalary) {
		super();  //to call the super class functionality/constructor
		this.eid = eid;
		this.ename = ename;
		this.esalary = esalary;
	}

	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public float getEsalary() {
		return esalary;
	}

	public void setEsalary(float esalary) {
		this.esalary = esalary;
	}

	public void display() {
		System.out.println("employee id :" + eid);
		System.out.println("employee name :" + ename);
		System.out.println("employee salary :" + esalary);

	}
}

public class revision2 {

	public static void main(String[] args) {
		Employee1 obj = new Employee1(111, "emi", 600000.0f);
		obj.display();
		obj.setEsalary(20000f);
		System.out.println(obj.setEsalary());

	}
}
