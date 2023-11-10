import java.util.ArrayList;
import java.util.List;

public class toArrayMethod {

	public static void main(String[] args) {
		List<String>list=new ArrayList<String>();
		list.add("Java");
		list.add("Features");
		list.add("toArray");
		String[] array=list.stream().toArray(String[]::new);
		
	}

}
