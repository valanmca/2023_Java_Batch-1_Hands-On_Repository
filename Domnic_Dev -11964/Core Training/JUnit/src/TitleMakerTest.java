import static org.junit.Assert.*;

import org.junit.Test;

public class TitleMakerTest {

	@Test
	public void test_title1() {

		TitleMaker title = new TitleMaker();

		assertEquals("Hello", title.makeTitle("heLLo"));

	}

	@Test
	public void test_title2() {

		TitleMaker title = new TitleMaker();

		assertEquals("Jackel", title.makeTitle("jackel"));

	}

	@Test
	public void test_title3() {

		TitleMaker title = new TitleMaker();

		assertEquals("Donglee", title.makeTitle("DONGLEE"));

	}

	@Test
	public void test_title4() {

		TitleMaker title = new TitleMaker();

		assertEquals("Raman", title.makeTitle("rAMAN"));

	}

}
