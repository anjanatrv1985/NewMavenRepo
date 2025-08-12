package abstraction;

public class FullTimeEmployee extends Employee {
	
	public void calculateSalary()
	{
		double payment=2000;
		double salary=payment*8;
		System.out.println("Full time employee salary is "+salary);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Contractor obj=new Contractor();
		obj.calculateSalary();
		FullTimeEmployee obj1=new FullTimeEmployee();
		obj1.calculateSalary();
	}

}
