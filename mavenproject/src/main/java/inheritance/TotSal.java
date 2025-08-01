package inheritance;

public class TotSal extends Calculation {
	
	double tot;
	public void totalsalary()
	{
		tot=bp+hra-pf-d+bon;
	}
	
	public void slip()
	{
		System.out.println("\n--- SALARY SLIP ---");
        System.out.println("Basic Pay: " + bp);
        System.out.println("Deduction: " + d);
        System.out.println("HRA (5%): " + hra);
        System.out.println("PF (20%): " + pf);
        System.out.println("Bonus: " + bon);
        System.out.println("Total Salary By Hand: " + tot);

	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 
		TotSal obj=new TotSal();
		obj.inputdata();
		obj.calc();
		obj.totalsalary();
		obj.slip();
	}

}
