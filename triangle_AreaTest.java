package test;

import static org.junit.Assert.*;

import org.junit.Test;

public class triangle_AreaTest {

	@Test
	public void test()
	{
		Junit test=new Junit();					//creating the object of class Junit 
		double result=test.triangle_Area(10, 5);//calling the method triangle_Area() 
		assertNotNull("the result is null",result);
		
	}

}
