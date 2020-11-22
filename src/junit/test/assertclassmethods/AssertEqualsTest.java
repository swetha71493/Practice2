package junit.test.assertclassmethods;

import static org.junit.Assert.*;

import org.junit.Test;


 class AssertEquals {
	public int area(int len) {
		return 2 * len;
	}
}


public class AssertEqualsTest {

	AssertEquals ob = new AssertEquals();

	@Test
	public void test() {
		int Area = ob.area(10);
		assertEquals(2 * 10, Area);
	}
	@Test
	public void test1() {
		int Area = ob.area(10);
		assertEquals(5 * 10, Area);
	}
}