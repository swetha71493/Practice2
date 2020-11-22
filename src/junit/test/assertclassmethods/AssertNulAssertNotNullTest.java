package junit.test.assertclassmethods;

import static org.junit.Assert.*;

import org.junit.Test;
class Sample{
	public void disp(){
		System.out.println("i am nul example");
	}
}

public class AssertNulAssertNotNullTest {
	// "assertNull" functionality is to check that an object is null.
	// "assertNotNull" functionality is to check that an object is not null.
	@Test
	public void assertNullTest() {
		Sample s=new Sample();
		System.out.println("before null in Null Test "+s);
		s=null;
		System.out.println("Ater null in Null Test "+s);
		assertNull(s);
	}

	@Test
	public void assertNotNullTest() {
		Sample s=new Sample();
		System.out.println("In Not null "+s);
		assertNotNull(s);
	}

}
