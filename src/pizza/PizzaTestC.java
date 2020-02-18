/**
 * 
 */
package pizza;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * @author apmake
 * pizza quantity q: int 1->10
 * pizza type t: string "c","b","c"
 * if (q<1||q>10) error
 * if(t=!a||t=!b||t=!c)
 * 
 * q=0,1,(2-9),10,11
 * t=a,b,c,d
 * 
 * cases 	(a,0),(a,1),(a,2),(a,9),(a,10),(a,11)
 * 			(b,0),(b,1),(b,2),(b,9),(b,10),(b,11)
 * 			(c,0),(c,1),(c,2),(c,9),(c,10),(c,11)
 * 			(d,1)
 *
 */
public class PizzaTestC {
	
	
	String nl = System.getProperty("line.separator");
	private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
	private final PrintStream originalOut = System.out;


	/**
	 * @throws java.lang.Exception
	 */
	Pizza pi;
	@Before
	public void setUp() throws Exception {
		pi = new Pizza();
		System.setOut(new PrintStream(outContent));
	}
	
	@After
	public void after() {
		System.setOut(originalOut);
	}


	@Test
	public void testB0(){
		pi.orderPizza(0, "c");
		String reply = outContent.toString();
		assertEquals("Quantity can not be less than 1"+nl,reply  );
	}
	@Test
	public void testB1(){
		pi.orderPizza(1, "c");
		String reply = outContent.toString();
		assertEquals("You have successfully ordered 1 pizza(s) of type c"+nl,reply  );
	}
	@Test
	public void testB2(){
		pi.orderPizza(2, "c");
		String reply = outContent.toString();
		assertEquals("You have successfully ordered 2 pizza(s) of type c"+nl,reply  );
	}
	@Test
	public void testB9(){
		pi.orderPizza(9, "c");
		String reply = outContent.toString();
		assertEquals("You have successfully ordered 9 pizza(s) of type c"+nl,reply  );
	}
	@Test
	public void testB10(){
		pi.orderPizza(10, "c");
		String reply = outContent.toString();
		assertEquals("You have successfully ordered 10 pizza(s) of type c"+nl,reply  );
	}
	@Test
	public void testB11(){
		pi.orderPizza(11, "c");
		String reply = outContent.toString();
		assertEquals("Quantity can not be more than 10"+nl,reply  );
	}
}
