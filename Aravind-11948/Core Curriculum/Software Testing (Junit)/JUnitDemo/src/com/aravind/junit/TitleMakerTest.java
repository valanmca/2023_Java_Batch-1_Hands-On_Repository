package com.aravind.junit;

import static org.junit.Assert.*;

import org.junit.Test;

public class TitleMakerTest {

	@Test
	public void test_title1() {
		
		TittleMaker title=new TittleMaker();
		
		assertEquals("Hello", title.makeTitle("heLLo"));
		
		
	}
	
	@Test
	public void test_title2() {
		
		TittleMaker title=new TittleMaker();
		
		assertEquals("Jackel", title.makeTitle("jackel"));
		
		
	}
	
	@Test
	public void test_title3() {
		
		TittleMaker title=new TittleMaker();
		
		assertEquals("Donglee", title.makeTitle("DONGLEE"));
		
		
	}
	
	@Test
	public void test_title4() {
		
		TittleMaker title=new TittleMaker();
		
		assertEquals("Raman", title.makeTitle("rAMAN"));
		
		
	}


}
