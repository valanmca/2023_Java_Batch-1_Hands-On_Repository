package com.jeyandhan.day07;

import java.util.ArrayList;
import java.util.Arrays;


interface Sortable{
    void sort(int[] array);
}

class QuickSort implements Sortable{
    ArrayList<Integer> list=new ArrayList<Integer>();
    public void sort(int[] array) {  
        Arrays.sort(array);
        for(int i=array.length-1;i>=0;i--) {
            System.out.print(array[i]);
        }
    }
}

class MergeSort implements Sortable{
    public void sort(int[] array) {
        Arrays.sort(array);
        for(int i=array.length-1;i>=0;i--) {
            System.out.print(array[i]);
        }
    }
}
public class Assignment4 {

    public static void main(String[] args) {
        QuickSort qs=new QuickSort();
        int array[]= {8,3,6,2,1};
        qs.sort(array);
        System.out.println("\n");
        MergeSort ms = new MergeSort();
        int array1[] = {12,11,5,3,8};
        ms.sort(array1);
    }

}
