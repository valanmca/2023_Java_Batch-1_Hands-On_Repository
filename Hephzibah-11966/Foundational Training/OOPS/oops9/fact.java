package oops9;

public class fact {
	
	void factorial(int n) {
		int num=1;
		for(int i=1;i<=n; i++) {
			num=num*i;
		}
		System.out.println(num);
	}
	
	static void digitcount(int n) {
		int count=0;
		
		while (n != 0) {
			n = n / 10;
			count++;
		}
		System.out.println(count);
	}

	public static void main(String[] args) {
		fact obj=new fact(); //calling instance void by object name
		obj.factorial(5);
		
		fact.digitcount(1111);

	}

}
