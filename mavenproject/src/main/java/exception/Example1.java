package exception;

public class Example1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
		int a=10;
		int b=0;
		int c=a/b;
		System.out.println(c);
		}
		catch(ArithmeticException e)
		{
			System.out.println("Exception handled");
			
		}
		finally
		{
			int a=10,b=15;
			int c=a+b;
			System.out.println(c);
			
					
		}
	}

}
