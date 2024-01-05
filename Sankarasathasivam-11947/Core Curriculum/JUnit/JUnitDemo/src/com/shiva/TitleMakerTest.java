package com.shiva;

import static org.junit.Assert.*;

import org.junit.Test;

public class TitleMakerTest {

	@Test
	public void test_hello() {
		TitleMaker str1 = new TitleMaker();
		assertEquals("Hello", str1.makeTitle("hello"));
	}

	@Test
	public void test_jackel() {
		TitleMaker str2 = new TitleMaker();
		assertEquals("Jackel", str2.makeTitle("jackel"));
	}

	@Test
	public void test_DONGLEE() {
		TitleMaker str3 = new TitleMaker();
		assertEquals("Donglee", str3.makeTitle("DONGLEE"));
	}

	@Test
	public void test_rAMAN() {
		TitleMaker str4 = new TitleMaker();
		assertEquals("Raman", str4.makeTitle("rAMAN"));
	}
}
