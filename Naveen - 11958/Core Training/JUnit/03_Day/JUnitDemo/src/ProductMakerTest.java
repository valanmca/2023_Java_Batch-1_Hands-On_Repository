import static org.junit.Assert.assertNotNull;

import org.junit.Test;

public class ProductMakerTest {

	@Test
	public void test_check() {
		Product p;
		ProductMaker pro = new ProductMaker();
		p = pro.makeObject();
		assertNotNull(p);
	}

}
