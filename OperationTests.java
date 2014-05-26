import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created with IntelliJ IDEA.
 * User: User
 * Date: 26.05.14
 * Time: 7:59
 * To change this template use File | Settings | File Templates.
 */
public class OperationTests {
	@Test
	public void testAddition(){
		Integer result = new Integer(4);
		assertEquals(result,(Number)4); 

		assertEquals(result, new Integer(4)); //true
		//assertEquals(result, (new ChainInteger).add(1,3))
		assertEquals(new Integer(7), (new Addition()).apply(1,6)); //true
	}

	@Test
	public void testSubtraction(){
		Integer result = new Integer(6);

		assertEquals(result, (new Subtraction()).apply(9,3)); //true
	}
	
	@Test
	public void testMultiplication(){
		Integer result = new Integer(15);

		assertEquals(result, (new Multiplication()).apply(5,3)); //true
	}
	
	@Test
	public void testStep(){
		Integer result = new Integer(27);

		assertEquals(result, (new Step()).apply(3,3)); //true
	}
	
	@Test
	public void testAlwaysPassed(){
		assertTrue(true);
	}
}
