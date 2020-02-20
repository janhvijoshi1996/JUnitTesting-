package test;

import static org.junit.Assert.*;

import org.junit.Test;

public class Cube_AreaTest {

	@Test
	public void test()
	{
		Junit test=new Junit();					//creating the object of class Junit 
		int result=test.cube_Area(2);			//calling the method cube_Area() 
		assertSame("the expected and actual area is not same ", 24, result);
	}
}
