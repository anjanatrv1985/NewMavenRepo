package abstraction;

public class Contractor extends Employee {
	
	public void calculateSalary()
	{
		double payment=1000;
		int hours=9;
		double salary=payment*hours;
		System.out.println("Contractor salary is "+salary);
		
	}

	}


