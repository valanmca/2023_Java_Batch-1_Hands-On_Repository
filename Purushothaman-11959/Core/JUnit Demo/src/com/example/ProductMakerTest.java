package com.example;

import static org.junit.Assert.*;

import org.junit.Test;

public class ProductMakerTest {

	@Test
	public void test_Product() {
		Product p;
		ProductMaker pm=new ProductMaker();
		p=pm.makeObject();
		assertNotNull(p);
	}

}
