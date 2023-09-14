package Assignment;
//Java Program to Find Sum and Average of All Elements in an Array
//Java Program to Search Key Elements in an Array
//Java Program to Count the Number of Occurrence of an Element in an Array
import java.util.Scanner;
public class arraysearchcount{

 public static void main(String[] args) {
 int arr[] = new int[3];
 System.out.println("Enter the Values : ");
 Scanner sc = new Scanner(System.in);
 for (int i = 0; i < arr.length; i++) {
 arr[i] = sc.nextInt(); // User Input of Array Elements
}

 System.out.println("Array Elements : ");// Display of Array Elements
 for (int i = 0; i < arr.length; i++) {
 System.out.println(arr[i]);
 }

 int sum = 0;
 for (int i = 0; i < arr.length; i++) {
 sum = sum + arr[i];
 }
 System.out.println("Sum of the Array is " + sum);// Sum of the Array

int avg = sum / arr.length - 1;
 System.out.println("Average of the Array : " + avg);// Average of the Array

 int flag = 0;
 System.out.println("Enter the value to search ");// Search Key elements in Array
 int search = sc.nextInt();// User Input of Array Elements
 for (int i = 0; i < arr.length; i++) {
 if (arr[i] == search) {
     flag =1;
      System.out.println("Search value is Present...");
 break;
}
}
if (flag != 1) {
 System.out.println("Search value is Absent...");
 }

 System.out.println("Enter the value to count : ");// Count the Number of Occurrence of an Element in an Array
 int countValue = sc.nextInt();// User Input of Array Elements
 int count = 0;
for (int i = 0; i < arr.length; i++) {
 if (countValue == arr[i]) {
 count++;
}
}
if (count == 0) {
 System.out.println("Count Value is Not Present ...");
 }
else
{
System.out.println("Count Value is Present " + count + " times...");}}}