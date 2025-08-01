package inheritance;

public class SinglelevelC extends SinglelevelP {
	
	public void color()
	{
		System.out.println("color of animal is black");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SinglelevelC obj=new SinglelevelC();
		obj.animal();
		obj.color();
	}

}
