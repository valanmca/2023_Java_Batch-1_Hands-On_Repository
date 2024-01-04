package com.junit;



import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import org.junit.Test;

public class TitleMakerTest {

	@Test
	public void test1() {
		TitleMaker tm = new TitleMaker();
		String Input = tm.makeTitle1("hello");
		assertEquals("Hello", Input);
	}

	@Test
	public void test2() {
		TitleMaker tm = new TitleMaker();
		String Input = tm.makeTitle1("jackel");
		assertEquals("Jackel", Input);
	}

	@Test
	public void test3() {
		TitleMaker tm = new TitleMaker();
		String Input = tm.makeTitle1("DONGLEE");
		assertEquals("Donglee", Input);
	}

	@Test
	public void test4() {
		TitleMaker tm = new TitleMaker();
		String Input = tm.makeTitle1("rAMAN");
		assertEquals("Raman", Input);
	}


}
