import static org.junit.Assert.*;

import org.junit.Test;

public class TitleMakerTest {

	@Test
	public void test_title1() {
		TitleMaker mc = new TitleMaker();
		assertEquals("Hello", mc.makeTitle("hello"));
	}
	@Test
	public void test_title2() {
		TitleMaker mc = new TitleMaker();
		assertEquals("Jackel", mc.makeTitle("jackel"));
	}
	@Test
	public void test_title3() {
		TitleMaker mc = new TitleMaker();
		assertEquals("Donglee", mc.makeTitle("DONGLEE"));
	}
	@Test
	public void test_title4() {
		TitleMaker mc = new TitleMaker();
		assertEquals("Raman", mc.makeTitle("rAMAN"));
	}
}

