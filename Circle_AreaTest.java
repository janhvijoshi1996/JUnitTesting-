package test;

import static org.junit.Assert.*;

import org.junit.Test;

public class Circle_AreaTest {

	@Test
	public void test() 
	{
		Junit test=new Junit();					//creating the object of class Junit 
		double result= test.circle_Area(4);		//calling the method circle_Area() 
		assertFalse("the actual area and expected area is same", result==5.24); 
	}

}
