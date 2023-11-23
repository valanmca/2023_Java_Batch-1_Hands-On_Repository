package Day6;
 class Animal1 {
	public void eat() {
		System.out.println("this is eat");
}
	 class dog extends Animal1{
		public  void eat() {
			System.out.println("dog is eat");
		}
	}
	 class elephant extends Animal1{
		public void eat() {
			System.out.println("elephant is eat");
		}
	}
}
public class Animal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Animal1 a=new Animal1();
		a.eat();
			}}
