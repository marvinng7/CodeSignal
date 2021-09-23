package dad.codesignal;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;


public class AddTestCentury {

	private centuryFromYear tjb;
	
	@Before
	public void setup() {
		tjb= new centuryFromYear();
	}

	@Test
	public void test1() {
		assertEquals(20,tjb.century(1956));
	}
	
	@Test
	public void test2() {
		assertEquals(17,tjb.century(1700));
	}
	
	@Test
	public void test3() {
		assertEquals(20,tjb.century(1901));
	}
	
	@Test
	public void test4() {
		assertEquals(21,tjb.century(2022));
	}
	
	@Test
	public void test5() {
		assertEquals(1,tjb.century(45));
	}
	
	@Test
	public void test6() {
		assertEquals(1,tjb.century(8));
	}
	
}
