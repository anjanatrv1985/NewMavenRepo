package inheritance;

import java.util.Scanner;

/*Pgm to find the total salary on hand of an employee
 * get basic pay,deduction and bonus from console
 */


public class SalaryOnHand {
	
	 double bp;
	 double d,bon;
	
	public void inputdata()
	{
	//	this.bp=bp;
	//	this.d=d;
	//	this.bon=bon;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter basic pay ");
		bp=sc.nextDouble();
		System.out.println("Enter deduction ");
		d=sc.nextDouble();
		System.out.println("Enter bonus ");
		bon=sc.nextDouble();
		//System.out.println(bp);
	}

}
