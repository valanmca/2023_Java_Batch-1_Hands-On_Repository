package oops9;

public class organisation {
	static String org="relevantz";
	int eid;

	organisation(int eid) {
		this.eid = eid;
	}

	void display() {
		System.out.println("employee id: " +eid);
	}

	public static void main(String[] args) {
       System.out.println(organisation.org);
       
       organisation hephzibah=new organisation(101);
       hephzibah.display();
       
       organisation swetha=new organisation(102);
       swetha.display();
       
       organisation dharshana=new organisation(103);
       dharshana.display();
       
       organisation gayathri=new organisation(103);
       gayathri.display();
       
	}

}
