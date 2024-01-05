package com.example;

import static org.junit.Assert.*;

import org.junit.Test;

public class TitleMakerTest {

	@Test
	public void test_titlemakertest1() {
		
		TitleMaker tm=new TitleMaker();
		assertEquals("Hello",tm.makeTitle("hello"));
			
	}
	
	@Test
	public void test_titlemakertest2() {
		
		TitleMaker tm=new TitleMaker();
		assertEquals("Jackel",tm.makeTitle("jackel"));
			
	}

	@Test
	public void test_titlemakertest3() {
		
		TitleMaker tm=new TitleMaker();
		assertEquals("Donglee",tm.makeTitle("DONGLEE"));
			
	}

	@Test
	public void test_titlemakertest4() {
		
		TitleMaker tm=new TitleMaker();
		assertEquals("Raman",tm.makeTitle("rAMAN"));
			
	}

}
