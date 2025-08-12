package interfaceeg;

public class HDFC implements RBI {
	
	public void recurringDeposit(double amount,int dur)
	{	
		Double custdep=amount*dur;
		double totalinterest=custdep*ann_interest;
		System.out.println("Customer mature amount after 5 years  "+(custdep+totalinterest));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HDFC obj=new HDFC();
		obj.recurringDeposit(10000,60);
	}

}
