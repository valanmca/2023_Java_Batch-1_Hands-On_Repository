package Java8;
import java.util.StringJoiner;

public class StrJoiner {

	public static void main(String[] args) {

		StringJoiner sj1=new StringJoiner(",");
		sj1.add("one");
		sj1.add("Two");
		sj1.add("Three");
		sj1.add("Four");
		StringJoiner sj2=new StringJoiner(" ","[","]");
		
		sj2.add("Five");
		sj2.add("Six");
		sj2.add("Seven");
		sj2.add("Eight");
		StringJoiner merging =sj2.merge(sj1);
		System.out.println(merging);
	}

}
