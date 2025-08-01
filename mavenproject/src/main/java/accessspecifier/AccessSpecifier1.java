package accessspecifier;

public class AccessSpecifier1 {
	
	public void display()
	{
		System.out.println("Public");
	}
	
	private void display1()
	{
		System.out.println("Private");
	}
	
	protected void display2()
	{
		System.out.println("protected");
	}
	
	void display3()
	{
		System.out.println("default");
	}
	
	public static void main (String args[])
	{
		AccessSpecifier1 obj=new AccessSpecifier1();
		obj.display();
		obj.display1();
		obj.display2();
		obj.display3();
	}

}
