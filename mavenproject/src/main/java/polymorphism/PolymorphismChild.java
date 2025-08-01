package polymorphism;

public class PolymorphismChild extends PolymorphismParent {

	public void Display(int a,int b)
	{
		int diff=a-b;
		System.out.println(diff);
		super.Display(30, 20);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		PolymorphismChild obj=new PolymorphismChild();
		obj.Display(5, 10);
	}

}
