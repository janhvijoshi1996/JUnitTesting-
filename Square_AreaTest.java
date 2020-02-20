package test;

import static org.junit.Assert.*;

import org.junit.Test;

public class Square_AreaTest {

	@Test
	public void test() 
	{
		Junit test=new Junit();   			//creating the object of class Junit 
		long result=test.square_Area(4);	//calling the method square_Area() 
		assertTrue("the actual result is less than the expected result ",result>14);
		
	}

}
