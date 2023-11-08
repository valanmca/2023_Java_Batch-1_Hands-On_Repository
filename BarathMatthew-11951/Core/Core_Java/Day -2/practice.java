package Java_basic;

import java.util.ArrayList;

public class practice {

	public static void main(String[] args) {
		ArrayList<Integer> coll=new ArrayList<Integer>();
		int start = 2;
		int end = 30;
		int count =0;
		for(int i =start;i<=end;i++) {
			for(int j=2;j<=i;j++) {
				if (i%j ==0) {
					coll.add(j);
					break;
				}
			}
//			if (count ==1) {
//				
//			}
//			count=0;
		}
		System.out.println(coll);
		
	}

}
