package collection;

import java.util.HashSet;
import java.util.Set;

public class NonGeneric {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set name=new HashSet(); //will not support TreeSet on non generic
	//Method 1 - Add	
		name.add("Anjana");
		name.add("B");
		name.add(41);
		//Second method - get
		
		System.out.println(name);

	}

}
