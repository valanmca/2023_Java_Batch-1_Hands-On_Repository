package Calculator;
public class AgeVerifier {
public int verifyAge(int age)
{
	if(age>=18 && age<=60)
	{
		//return "Age Verfied";
		System.out.println("Age Verfied");
	}
	else if(age<18)
	{
		System.out.println("Invalid Age");
	}
	else if(age>60)
	{
		System.out.println("Age is Over");
	}
	else if(age>=66)
	{
		System.out.println("Exception has to raise,not checking the messages");
	}
	    return age;
	    
}
}
