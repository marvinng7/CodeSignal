package dad.codesignal;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class AddTestSuite {

	private TheJourneyBegins tjb;
	
	@Before
	public void setup() {
		tjb= new TheJourneyBegins();
	}
	@Test
	public void test1() {
		TheJourneyBegins tjb = new TheJourneyBegins();
		int resultado = tjb.add(1, 2);
		assertEquals(resultado, 3);
	}
	
	@Test
	public void test2() {
		TheJourneyBegins tjb = new TheJourneyBegins();
		int resultado = tjb.add(30, -15);
		assertEquals(resultado, 15);
	}
}
