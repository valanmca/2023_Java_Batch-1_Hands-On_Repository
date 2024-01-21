package com.Assignment;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Test;

public class TitleMakerTest {

	@Test
	public void test_cap1() {
		
		TitleMaker tm=new TitleMaker();
		String input=tm.makeTitle("input");
		assertEquals("Input",input);
	}
	
	public void test_cap2() {
		
		TitleMaker tm=new TitleMaker();
		String input=tm.makeTitle("hello");
		assertEquals("Hello",input);
	}
	
	public void test_cap3() {
		
		TitleMaker tm=new TitleMaker();
		String input=tm.makeTitle("jackel");
		assertEquals("Jackel",input);
	}
	public void test_cap4() {
		
		TitleMaker tm=new TitleMaker();
		String input=tm.makeTitle("DONGLEE");
		assertEquals("Donglee",input);
	}
	
	public void test_cap5() {
		
		TitleMaker tm=new TitleMaker();
		String input=tm.makeTitle("rAMAN");
		assertEquals("Raman",input);
	}
	
		
	

}
