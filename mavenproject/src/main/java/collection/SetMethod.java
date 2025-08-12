package collection;

import java.util.*;

public class SetMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		    Set<String> color=new TreeSet<String>(); //No duplicate
				color.add("Red");
				color.add("Blue");
				color.add("Yellow");
				color.add("White");
				System.out.println(color);
			Set<String> fruits=new HashSet<String>();
				fruits.add("Mango");
				fruits.add("Banana");
				fruits.add("Papaya");
				fruits.add("PineApple");
				fruits.add("Apple");
				fruits.add("Banana");
			    System.out.println(fruits);
			    
			    //Method1 - addall()
			    color.addAll(fruits);
			    System.out.println(color);
			    System.out.println(fruits);
			 //   System.out.println(color.containsAll(fruits));
			    //Method2 removeall
			    color.removeAll(fruits);
			    System.out.println(color);
			    System.out.println(fruits);
			    //Method3 - containsall()
			    System.out.println(color.containsAll(fruits));
			    //Method4 - size()
			    System.out.println(fruits.size());
	}

}
