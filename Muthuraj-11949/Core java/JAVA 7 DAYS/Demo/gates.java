package Demo;
import java.util.ArrayList;
import java.util.List;
public abstract class gates {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		public List <Gate> input =new ArrayList <Gate>();
		public  output=new Gate();
		public abstract boolean calc();	
	   public static void  LogicGate(int inputs) {
			for (int i=0;i<inputs;i++) {
				input.add(new Gate());
			}
	}
}
