package Day7;
interface Sortable{
	void sort(int[] array);	
}

class QuickSort implements Sortable{
	 public void sort(int[] array) {
		 for(int i=0;i>5;i--){
		  System.out.println("desending order:"+"");	
		}	
	 }
}

class MergeSort implements Sortable{
  public void sort(int[] array) {
       for(int i=0;i>5;i--) {
	  System.out.println("");	
	}
  }
 }

public class Ass4 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int[] arr = { 5,10,15,20,25};
		Sortable Obj1=new QuickSort();
		Obj1.sort(arr);
		Sortable Obj2=new MergeSort();
		Obj2.sort(arr);
    }
}

