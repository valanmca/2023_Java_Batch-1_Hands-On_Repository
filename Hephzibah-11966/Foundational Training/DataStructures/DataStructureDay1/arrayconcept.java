package DataStructureDay1;

public class arrayconcept {

	public static void main(String[] args) {
		int arr[]= {10,20,30,40,50};
		System.out.println(arr[4]);
		System.out.println("Third element: " + arr[2]);
		
		arr[2] = 88; //updating or modifying the element;
		
		System.out.println("New Element : " + arr[2]);
		System.out.println("length" + arr.length); // finding the length of the array;
		
		System.out.println("Array Elements are :");
		for(int i=0; i<arr.length; i++) {
			System.out.println( arr[i]);
			
		}

	}

}
