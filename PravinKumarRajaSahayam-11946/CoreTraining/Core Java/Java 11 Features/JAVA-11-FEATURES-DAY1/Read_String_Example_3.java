//Java - 11 Nested based access control
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
public class Read_String_Example_3 {
	private void display() {
		System.out.println("hello from private method");
	}	
	class NestedMain{
		void msg() {
			display();
		}
	}
	public static void main(String[] args) throws IOException {
// TODO Auto-generated method stub
			 	
				Read_String_Example_3 m = new Read_String_Example_3();
			    Read_String_Example_3.NestedMain n = m.new NestedMain();
				n.msg();
				
			}   


	}




