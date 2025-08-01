package polymorphism;

public class Square extends Shape {

	public void area(double side)
	{
		double area=side*side;
		System.out.println("Area of a square "+" "+area);
		super.area(10);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Square obj=new Square();
		obj.area(20);
	}

}
