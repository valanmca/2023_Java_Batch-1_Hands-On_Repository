import static org.junit.Assert.*;

import org.junit.Test;

public class CalculatorTest {

	@Test
	public void test_add1() {
		Calculator calc=new Calculator();
		int result=calc.add(10,5);
		assertEquals(15, result);
	}
	
	@Test
	public void test_add2() {
		Calculator calc=new Calculator();
		assertEquals(-5, calc.add(-10, 5));
	}
	
	@Test
	public void test_multi1() {
		Calculator calc=new Calculator();
		assertEquals(15, calc.multiplication(3,5));
	}
	@Test
	public void test_multi2() {
		Calculator calc=new Calculator();
		assertEquals(25, calc.multiplication(5,5));
	}
	
	@Test
	public void test_divide() {
		Calculator calc=new Calculator();
		try {
			int result=calc.divide(4, 0);
			assertEquals(0,result);

		}catch(Exception e) {
			
		}
	}

}
