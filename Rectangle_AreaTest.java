package test;

import static org.junit.Assert.*;

import org.junit.Test;

public class Rectangle_AreaTest {

	@Test
	public void test()
	{
		Junit test=new Junit();				//creating the object of class Junit 
		int result=test.rectangle_Area(12,4);    //calling the method rectangle_Area() 
		assertEquals("Actual area and Expected area is not same",48, result);   //compare the actual and expected result 
	}
}
