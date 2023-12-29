package com.junit;

import static org.junit.Assert.*;

import org.junit.Test;

public class TitileMakerTest {

	@Test
	public void test_1() 
	{
		TitleMaker tm = new TitleMaker();
		String Input = tm.makeTitle("hello");
		assertEquals("Hello", Input);
		
	}
	
	@Test
	public void test_2() 
	{
		TitleMaker tm = new TitleMaker();
		String Input = tm.makeTitle("jackel");
		assertEquals("Jackel", Input);
	}
	
	@Test
	public void test_3() 
	{
		TitleMaker tm = new TitleMaker();
		String Input = tm.makeTitle("DONGLEE");
		assertEquals("Donglee", Input);
	}
	
	@Test
	public void test_4() 
	{
		TitleMaker tm = new TitleMaker();
		String Input = tm.makeTitle("rAMAN");
		assertEquals("Raman", Input);
	}


}
