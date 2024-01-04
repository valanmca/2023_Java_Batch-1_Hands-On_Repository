package com.junit;

import static org.junit.Assert.*;

import org.junit.Test;

public class ProductMakerTest {

	@Test
	public void test() {
		Product p;
		ProductMaker pm = new ProductMaker();
		p = pm.makeObject();
		assertNotNull(p);
		
	}

}
