package Java8;
import java.util.*;

public class B64 {

	public static void main(String[] args) {
        // create a sample String to encode

		String sample = "Hi Domnic";
        // print actual String

		System.out.println("Sample string = " + sample);
        // Encode into Base64 format

		String BasicBase64format = Base64.getEncoder().encodeToString(sample.getBytes());
        // print encoded String

		System.out.println("Encoded String = " + BasicBase64format);
	}

}
