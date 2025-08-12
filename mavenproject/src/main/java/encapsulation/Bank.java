package encapsulation;

//Assignment 14
public class Bank {
	
	private int pin;
	public void setpin(int userpin)
	{
		this.pin=userpin;
	}
	
	//valid pins : 1001,1234,1212
	public void Validate()
	{
		if(pin==1001)
		{
			System.out.println("Pin is valid, Proceed with withdrawal");
		}
		else if(pin==1234)
		{
			System.out.println("Pin is valid, Proceed with withdrawal");
		}
		else if(pin==1212)
		{
			System.out.println("Pin is valid, Proceed with withdrawal");
		}
		else 
						{
				System.out.println("Pin is invalid,transaction cancelled");
			}
	}

}
