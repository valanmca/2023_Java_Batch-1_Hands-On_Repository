package com.core.day_15;
record Trainee(int id,String name) {
    public Trainee{
        if(id<100 || name.isEmpty()) {
            throw new IllegalArgumentException("Invalid data");
        }
    }
}

public class RecordClass3 {

	public static void main(String[] args) {
		 Trainee t1=new Trainee(101,"sara");
	        System.out.println(t1);
	        Trainee t2=new Trainee(50,"shiva");
	        System.out.println(t2);

	}

}
