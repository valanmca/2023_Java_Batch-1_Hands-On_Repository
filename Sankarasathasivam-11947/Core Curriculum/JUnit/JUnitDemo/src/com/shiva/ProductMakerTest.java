package com.shiva;

import static org.junit.Assert.*;

import org.junit.Test;

public class ProductMakerTest {

	@Test
	public void test_productmaker() {
		Product p1;
		ProductMaker pm = new ProductMaker();
		p1 = pm.makeObject();
		assertNotNull(p1);
	}

}
