package com.muthu;

import static org.junit.Assert.*;
import org.junit.Test;

public class TestClass3 {

	@Test
	public void test() {
		
		        Cap cap = new Cap();
		        assertEquals(false, cap.checkIsogram("hello"));
		        assertEquals(true, cap.checkIsogram("jackel"));
		        assertEquals(false, cap.checkIsogram("DONGLEE"));
		        assertEquals(false, cap.checkIsogram("rAMAN"));
		        assertEquals(true, cap.checkIsogram("importance"));    
		    }

		
	}


