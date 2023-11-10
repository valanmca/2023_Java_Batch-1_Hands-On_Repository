package Java_Basics;

import java.util.Scanner;
public class factorial {

    public static void main(String[] args) {
        System.out.println("Factorial");
        Scanner sc = new Scanner(System.in);
        int fact = sc.nextInt();
        int temp =1;
        for(int i = 1;i<=fact;i++) {
            temp *=i;
        }
        System.out.println(temp);
    }

}
