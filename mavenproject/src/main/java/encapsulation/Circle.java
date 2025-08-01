package encapsulation;

public class Circle 
{
	private double radius,area,circum;
	
	public void setradius(double radius)
	{
		this.radius=radius;
	}
	
	public double getarea()
	{
		area=3.14*radius*radius;
		return area;
		
	}
	
	public double getcircum()
	{
		circum=2*3.14*radius;
		return circum;
	}
	
	

}
