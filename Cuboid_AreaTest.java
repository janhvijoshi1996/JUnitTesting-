package test;

import static org.junit.Assert.*;

import org.junit.Test;

public class Cuboid_AreaTest {

	@Test
	public void test() 
	{
		Junit test=new Junit();						//creating the object of class Junit 
		double result=test.cuboid_Area(4,2,3);		//calling the method cuboid_Area() 
		assertEquals("the actual area and expected area in not same ",53, result, 1);
	}

}
