package Calculator;

import static org.junit.Assert.*;

import org.junit.Test;

public class ProductMakerTest {

	@Test
	public void Methodtest1() {
		Product mv = new Product();
		Product p;
		p=mv.makeObject();
		assertNull(p);
	}

}
