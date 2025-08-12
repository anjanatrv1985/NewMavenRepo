package aggregation;

public class Assignment12Addr {
	
	String housename;
	int pincode;
	String state;
	Assignment12Stud obj;
	
	public void Address(String housename,int pincode,String state,Assignment12Stud obj)
	{
		this.housename=housename;
		this.pincode=pincode;
		this.state=state;
		this.obj=obj;
	}
	
	public void display()
	{
		System.out.println(obj.name);
		System.out.println(obj.rollno);
		System.out.println(housename);
		System.out.println(pincode);
		System.out.println(state);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Assignment12Stud obj1=new Assignment12Stud();
		obj1.Student("Anjana", 40);
		Assignment12Addr obj2=new Assignment12Addr();
		obj2.Address("Bodhi", 695006, "Kerala", obj1);
		obj2.display();
		
	}

}
