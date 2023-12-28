package Calculator;
import static org.junit.Assert.*;
import org.junit.Test;
public class MyCalculatorTest {

	@Test
	public void test_addition() {
		MyCalculator mc = new MyCalculator();
		int result=mc.addition(1,4);
		assertEquals(5,result);
	}

	@Test
	public void test_addition1() {
		MyCalculator mc = new MyCalculator();
		assertEquals(-10,mc.addition(-14, 4));
	}
	
	@Test
	public void test_multiplication() {
		MyCalculator mc = new MyCalculator();
		assertEquals(5,mc.multiplication(1,5));
	}
	
	@Test
	public void test_multiplication1() {
		MyCalculator mc = new MyCalculator();
		assertEquals(5,mc.multiplication(1, 5));
	}
	
	@Test
	public void test_division()
	{
		MyCalculator mc = new MyCalculator();
		try {
		int result=mc.division(1,0);
		assertEquals(4,result);
		}catch(Exception e)
		{
			//TODO : Handle Exception
			fail("Invalid Division");
		}
	}
}
