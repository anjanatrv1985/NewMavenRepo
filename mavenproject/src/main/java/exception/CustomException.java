package exception;

public class CustomException {

	public void validateage(int age) throws ArithmeticException
	{
		if(age<18)
		{
			//System.out.println("Not eligible");
			throw new ArithmeticException("Access denied");
		}
		else
		{
			System.out.println("Eligible for licence");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CustomException obj=new CustomException();
		try 
		{
			obj.validateage(20);
			
		}
		catch(ArithmeticException e) 
		{
			
			
		}
				
	}

}
