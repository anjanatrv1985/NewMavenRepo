package superkeyword;

public class SuperMethod2 extends SuperMethod1 {
	
	public void childdisplay()
	{
		super.display();
		System.out.println("Display child method");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SuperMethod2 obj=new SuperMethod2();
		obj.childdisplay();
	}

}
