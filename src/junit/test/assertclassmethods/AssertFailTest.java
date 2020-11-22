package junit.test.assertclassmethods;

	
	import static org.junit.Assert.fail;
	import org.junit.Before;
	import org.junit.Test;
	 
	public class AssertFailTest {
	 
	  Foo foo;
	 
	  @Before
	  public void setUp() {
	    foo = new Foo();
	  }
	 
	  @Test
	  public void failExampleTest() {
	 
	    if(foo == null){
	      fail("foo is null");
	    }
	 
	    try {
	      foo.method(-1);
	      fail("Should of thrown an IllegalArgumentException");
	    } catch (IllegalArgumentException e) {
	      // handle exception
	    }
	 
	  }
	}

	 class Foo {
		 
		  void method(int x) throws IllegalArgumentException {
		 
		    if (x < 0) {
		      throw new IllegalArgumentException();
		    }
		  }
		}
