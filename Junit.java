package test;

public class Junit 
{
	static final double pi=3.14;
	public int rectangle_Area(int length, int width)
	{
		return length*width;          //method returns area of rectangle 
	}
	public long square_Area(long side)
	{
		return side*side;			//method returns area of square 
	}
	public double circle_Area(double radius)
	{
		return pi*radius*radius;	//method returns area of circle
	}
	public double triangle_Area(double base,double height)
	{
		return 0.5*base*height;		//method returns area of triangle 
	}
	public double cuboid_Area(double length, double width, double height)
	{
		return 2*((length*width)+(length*height)+(width*height)); //method returns area of cuboid 
	}
	public int cube_Area(int side)
	{
		return 6*side*side;        //method returns area of cube 
	}
}
