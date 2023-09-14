package oops14;
interface BankFDPlan{
	void fixedDeposit();
	void intrestRate();
}
abstract class BankFD implements BankFDPlan{
	public  void fixedDeposit() {
		System.out.println("We are providing fixed deposit");
	}
	public abstract void intrestRate();
}
class HDFCFD extends BankFD{
	public void intrestRate() {
		System.out.println("@ 7.5 rate");
	}
}
	class SBIFD extends BankFD{
		public void intrestRate() {
			System.out.println("@ 6.5 rate");
		}
	}


public class _6AbstractInterfaceMultipleInheri {

	public static void main(String[] args) {
		HDFCFD obj=new HDFCFD();
		obj.fixedDeposit();
		obj.intrestRate();
		
		
		SBIFD obj1=new SBIFD();
		obj1.fixedDeposit();
		obj1.intrestRate();

	}

}
