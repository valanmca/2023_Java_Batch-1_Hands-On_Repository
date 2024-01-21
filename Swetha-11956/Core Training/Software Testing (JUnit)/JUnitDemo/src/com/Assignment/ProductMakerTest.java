package com.Assignment;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.BeforeClass;
import org.junit.Test;

public class ProductMakerTest {

	@Test
	public void test_product1() {
		
		Product p;
		ProductMaker pro= new ProductMaker();
		p=pro.makeObject();
		assertNotNull(pro);
	}

}
