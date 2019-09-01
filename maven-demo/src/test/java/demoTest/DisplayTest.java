package demoTest;

import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;

import demo.Display;

public class DisplayTest {
	
	@Test
	public void testDisplayMessage_positive() throws Exception {
		
		Display display = new Display();
		
		String result = display.displayMessage(20);
		
		Assert.assertNotNull(result);
		Assert.assertTrue("Hello Ankit !!!", true);
		
	}
	
	@Test
	//@Ignore
	public void testDisplayMessage_negative() throws Exception {
		
		Display display = new Display();
		
		String result = display.displayMessage(12);
		
		Assert.assertNotNull(result);
		Assert.assertTrue("Hello Nikhil", true);
		
	}
	
	@Test(expected = Exception.class)
	public void testDisplayMessage_exception() throws Exception {
		
		Display display = new Display();
		
		String result = display.displayMessage(18);
		
		Assert.assertNotNull(result);
		
	}

}
