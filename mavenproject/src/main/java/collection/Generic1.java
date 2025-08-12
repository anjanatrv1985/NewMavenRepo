package collection;


import java.util.*;

public class Generic1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> fruits=new ArrayList<String>();
		//Method 1 - Add()
		fruits.add("Mango");
		fruits.add("Banana");
		fruits.add("Papaya");
		fruits.add("PineApple");
		fruits.add("Apple");
		fruits.add("Banana");
	//	System.out.println(fruits);
		//Method 2- get()
		System.out.println(fruits.get(3));
		//method3 - set (to change the element in the index given
		fruits.set(3, "Orange");
		//Method4 - index of()
		System.out.println(fruits.indexOf("Banana"));
		//Method 5 - lastindexof()
		System.out.println(fruits.lastIndexOf("Banana"));
		//Method6- remove()
		fruits.remove(5);
		System.out.println(fruits);
		//method 7 - contains()
		System.out.println(fruits.contains("Grapes"));
		//method 8 - isempty()
		System.out.println(fruits.isEmpty());
		//size()
		System.out.println(fruits.size());
		
		
	}

}
