package junit.test.assertclassmethods;

import static org.junit.Assert.*;

import org.junit.Test;

public class AssertFalseTrueTest {
	// "assertFalse" functionality is to check that a condition is false.
	// "assertTrue" functionality is to check that a condition is true.
	@Test
	public void testAssertFalse() {
		assertFalse(8 < 5);
	}

	@Test
	public void testAssertTrue() {
		assertTrue(5 < 8);
	}
}
