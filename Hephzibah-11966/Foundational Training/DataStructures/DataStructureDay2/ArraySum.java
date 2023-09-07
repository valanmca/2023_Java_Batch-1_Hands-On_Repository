package DataStructureDay2;

public class ArraySum {

	public static void main(String[] args) {
		int arr[]=new int[] {10,20,30};
		int sum=0;
		
		for( int i=0; i<arr.length; i++) {
			 sum=sum+arr[i];	
		}
		System.out.println("sum of arrays :" +sum);
		System.out.print(arr[0]+arr[1]+arr[2]);
	}

}
