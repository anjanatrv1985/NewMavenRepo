package superkeyword;

public class Assignment11C extends Assignment11P {
	
	public void divisible()
	{
		super.add(10, 20);
		if(sum%10==0)
		{
			System.out.println("Sum is divisible by 10");
		}
		else
		{
			System.out.println("Sum is not divisible by 10");
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Assignment11C obj=new Assignment11C();
		obj.divisible();
	}

}
