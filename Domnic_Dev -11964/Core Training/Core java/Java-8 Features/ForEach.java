package Java8;

import java.util.ArrayList;

public class ForEach {

	public static void main(String[] args) {
    ArrayList<String> Studentlist=new ArrayList<String>();
    Studentlist.add("Domnic");
    Studentlist.add("Shiva");
    Studentlist.add("Mahesh");
    Studentlist.add("Aravind");

    Studentlist.forEach(student ->System.out.println(student));
    Studentlist.forEach(System.out::println);
	}

}
