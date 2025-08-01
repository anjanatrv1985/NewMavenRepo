package encapsulation;

public class Circle2 {

	public static void main (String args[])
	{
		Circle c=new Circle();
		c.setradius(5);
		System.out.println("Area is "+" "+c.getarea());
		System.out.println("Circumference is "+" "+c.getcircum());
	}

}
