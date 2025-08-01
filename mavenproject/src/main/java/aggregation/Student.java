package aggregation;

public class Student {
	
	String name;
	int rollno;
	Address obj; // joins the two classes
	public Student(String name,int rollno,Address obj)
	{
		this.name=name;
		this.rollno=rollno;
		this.obj=obj;
	}
	
	public void display()
	{
		System.out.println(name);
		System.out.println(rollno);
		System.out.println(obj.pincode);
		System.out.println(obj.state);
	}
	public static void main (String args[]) {
		
	Address obj1=new Address("Kerala",25);
	Student obj2=new Student("Anjana",40,obj1);
	obj2.display();
	
		
	}

}
