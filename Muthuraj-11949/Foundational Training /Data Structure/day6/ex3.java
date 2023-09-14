package com.muthu.day6;
import java.util.Scanner;
import java.util.ArrayList;
public class ex3 {
	public static void main(String[] args) {
	ArrayList<Integer> arr = new ArrayList<Integer>();
	System.out.println("Enter the digit:");
Scanner sc = new Scanner(System.in);
int n = sc.nextInt();
	System.out.println("Enter the values:");
	for (int i = 0; i < n; i++) 
	{
	int value = sc.nextInt();
	arr.add(value);
	}

 System.out.println(arr);

	System.out.println("Enter the search element:");
	int search = sc.nextInt();

int low = 0;
int high = arr.size() - 1;
	int mid = (low + high) / 2;

	boolean isPresent = false;
	while (low <= high) {
	if (arr.get(mid) == search) {
	System.out.println("Element is present at index:" + mid);
    isPresent = true;
	break;
	}
	else if (arr.get(mid) > search) {
	high = mid - 1;
	mid = (low + high) / 2;
	} 
	else {
	low = mid + 1;
mid = (low + high) / 2;
	}
	}
if (isPresent == false) {
	System.out.println("Element is not present");}}}