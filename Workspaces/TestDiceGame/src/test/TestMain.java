package test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;


public class TestMain {
	
	@Test
	public void test() {
		
	
		Sides sides = new Sides(1,1,1);
		assertEquals(sides.getPoints(sides), new Integer(1000));
		
		
		
	}

}
