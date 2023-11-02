//Java - 8 ForEach Method
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.StringJoiner;
import java.util.stream.Collectors;

public class Lambda_Example6 {
	public static void main(String[] args) {
// TODO Auto-generated method stub
		ArrayList<String> StudentList = new ArrayList<String>();
		StudentList.add("Pravins");
		StudentList.add("Kumar");
		StudentList.add("Raja");
		StudentList.add("Sahayam");
		// for(int i=0;i<StudentList.length;i++)
		// {
		// System.out.println(StudentList);
		// }
		// System.out.println(StudentList);
		StudentList.forEach(student -> System.out.println(student));
		System.out.println("--------------------------");
		StudentList.forEach(System.out::println);
	}

}
