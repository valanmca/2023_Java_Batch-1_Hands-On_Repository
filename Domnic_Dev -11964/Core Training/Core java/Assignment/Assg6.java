package Core_Topic_Domnic_Day_2;

public class Assg6 {

	public static void main(String args[])
	   {
	    int a=Integer.parseInt(args[0]);
	    int b=Integer.parseInt(args[1]);
	    int c=Integer.parseInt(args[2]);
	    System.out.println("The First Number : "+a);
	    System.out.println("The Second Number : "+b);
	    System.out.println("The Third Number : "+c);

	    if(a>b && a>c)
	    {
	       System.out.println(+a+" is greater than b and c ");
	    }
	    else if(b>a && b>c)
	    {
	       System.out.println(+b+" is greater than a and c ");
	    }
	    else
	    {
	       System.out.println(+c+" is greater than a and b ");
	    }
	   }

	

}
