package abstraction;

public class AbstractC extends AbstractionEgP {
	
	public void display()
	{
		System.out.println("Abstract method");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//	AbstractC obj=new AbstractC();  //first option 
		AbstractionEgP obj=new AbstractC();   //second option 
		obj.display();
		obj.print();
		
	}

}
