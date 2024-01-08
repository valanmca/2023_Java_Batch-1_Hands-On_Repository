package com.aravind.junit;

import static org.junit.Assert.*;

import org.junit.Test;

public class ProductMakerTest {

	@Test
	public void test_product() {
		
		Product p;
		
		ProductMaker object=new ProductMaker();
		p=object.MakeObject();
		assertNotNull(p);
		
	}

}
