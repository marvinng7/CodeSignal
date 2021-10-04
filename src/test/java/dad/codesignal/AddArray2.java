package dad.codesignal;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class AddArray2 {

private MakeArrayConsecutive2 tjb;
	
	@Before
	public void setup() {
		tjb= new MakeArrayConsecutive2();
	}
	
		@Test
		public void test1() {
			int statues[] = new int[] {6, 2, 3, 8};
			assertEquals(3,tjb.makeArrayConsecutive2(statues));
		}
		@Test
		public void test2() {
			int statues[] = new int[] {0, 3};
			assertEquals(2,tjb.makeArrayConsecutive2(statues));
		}
		@Test
		public void test3() {
			int statues[] = new int[] {5, 4, 6};
			assertEquals(0,tjb.makeArrayConsecutive2(statues));
		}
		@Test
		public void test4() {
			int statues[] = new int[] {6, 3};
			assertEquals(2,tjb.makeArrayConsecutive2(statues));
		}
		@Test
		public void test5() {
			int statues[] = new int[] {1};
			assertEquals(0,tjb.makeArrayConsecutive2(statues));
		}

}
