package Assignment;

import java.util.LinkedList;

public class ex4 {
    public static int findElementPosition(LinkedList<Integer> linkedList, int target) {
        int position = 0;
        for (Integer element : linkedList) {
            if (element == target) {
                return position;
            }
            position++;
        }
        return -1;
    }

    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(10);
        linkedList.add(20);
        linkedList.add(30);
        linkedList.add(40);
        linkedList.add(50);

        int target = 60;
        int position = findElementPosition(linkedList, target);

        if (position != -1) {
            System.out.println("Element " + target + " found at position " + position);
        } else {
            System.out.println("Element " + target + " not found in the LinkedList");
        }
    }
}
