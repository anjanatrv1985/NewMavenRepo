package encapsulation;

import java.util.Scanner;

//Assignment 14
public class User {
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the pin ");
		int userpin=sc.nextInt();
		Bank obj1=new Bank();
		obj1.setpin(userpin);
		obj1.Validate();	
	}
	
}
