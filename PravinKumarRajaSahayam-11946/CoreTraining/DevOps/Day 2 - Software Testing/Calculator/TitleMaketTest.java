package Calculator;
import static org.junit.Assert.*;
import org.junit.Test;
public class TitleMaketTest {
	@Test
	public void test_Test1() {
		TitleMaker mc = new TitleMaker();
		String Input=mc.makeTitle("hello");
		assertEquals("Hello",Input);
	}

	@Test
	public void test_Test2() {
		TitleMaker mc = new TitleMaker();
		String Input=mc.makeTitle("jackel");
		assertEquals("Jackel",Input);
	}

	@Test
	public void test_Test3() {
		TitleMaker mc = new TitleMaker();
		String Input=mc.makeTitle("DONGLEE");
		assertEquals("Donglee",Input);
	}
	
	@Test
	public void test_Test4() {
		TitleMaker mc = new TitleMaker();
		String Input=mc.makeTitle("rAMAN");
		assertEquals("Raman",Input);
	}
}
