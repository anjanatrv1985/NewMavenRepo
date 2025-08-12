package polymorphism;

public class Offseason extends Onseason {
	
	double disc;
	public void discount(double price)
	{
		disc=price*0.40;
		System.out.println("Off season discount is "+disc);
		super.discount(4000);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Offseason obj=new Offseason();
		obj.discount(4000);
		
	}

}
