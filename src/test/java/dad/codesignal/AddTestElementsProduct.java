package dad.codesignal;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class AddTestElementsProduct {

private adjacentElementsProduct tjb;
	
	@Before
	public void setup() {
		tjb= new adjacentElementsProduct();
	}
	
	@Test
	public void test1() {
		int [] inputArray = {3, 6, -2, -5, 7, 3};
		assertEquals(21,tjb.adjacentElementsProduct(inputArray));
	}
	@Test
	public void test2() {
		int [] inputArray = {-1, -2};
		assertEquals(2,tjb.adjacentElementsProduct(inputArray));
	}
	@Test
	public void test3() {
		int [] inputArray = {5, 1, 2, 3, 1, 4};
		assertEquals(6,tjb.adjacentElementsProduct(inputArray));
	}
	@Test
	public void test4() {
		int [] inputArray = {1, 2, 3, 0};
		assertEquals(6,tjb.adjacentElementsProduct(inputArray));
	}
	@Test
	public void test5() {
		int [] inputArray = {9, 5, 10, 2, 24, -1, -48};
		assertEquals(50,tjb.adjacentElementsProduct(inputArray));
	}
	@Test
	public void test6() {
		int [] inputArray = {5, 6, -4, 2, 3, 2, -23};
		assertEquals(30,tjb.adjacentElementsProduct(inputArray));
	}
	@Test
	public void test7() {
		int [] inputArray = {4, 1, 2, 3, 1, 5};
		assertEquals(6,tjb.adjacentElementsProduct(inputArray));
	}
	@Test
	public void test8() {
		int [] inputArray = {-23, 4, -3, 8, -12};
		assertEquals(-12,tjb.adjacentElementsProduct(inputArray));
	}
	@Test
	public void test9() {
		int [] inputArray = {1, 0, 1, 0, 1000};
		assertEquals(0,tjb.adjacentElementsProduct(inputArray));
	}
	
}
