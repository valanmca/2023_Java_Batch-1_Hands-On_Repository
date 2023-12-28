package com.muthu;

import static org.junit.Assert.*;
import org.junit.Test;


public class ProductMakerTest {

	@Test
	public void test() {
		Product p;
		ProductMaker pro=new ProductMaker();
		p=pro.makeObject();

		assertNotNull(p);;
	}
}
