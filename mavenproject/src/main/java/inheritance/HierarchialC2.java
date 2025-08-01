package inheritance;

public class HierarchialC2 extends HierarchialP {
	
	public void speed()
	{
		System.out.println("car speed is 80km/h");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HierarchialC2 obj2=new HierarchialC2();
		obj2.speed();
		obj2.car();
		
	}

}
