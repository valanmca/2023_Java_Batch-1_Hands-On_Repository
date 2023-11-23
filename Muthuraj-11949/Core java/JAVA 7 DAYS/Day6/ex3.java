package Day6;
public class ex3 {
	void concat(int a ,int b) {
		System.out.println(a +" "+ b);
	
	}
	void concat(String a ,String b) {
		System.out.println(a +" "+ b);
	
	}
	void concat(float a ,float b) {
		System.out.println(a +" "+ b);
	
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			ex3 obj=new ex3();
			obj.concat("Valan","Muthuraj");
			obj.concat(12.3f,14.5f);
			obj.concat(234, 443);
			
			
		

	}

}
