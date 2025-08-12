package collection;

import java.util.*;
import java.util.TreeSet;

public class IteratorEg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Set<String> color=new TreeSet<String>(); //No duplicate
			color.add("Red");
			color.add("Blue");
			color.add("Yellow");
			color.add("White");
			System.out.println(color);
			Iterator<String> i=color.iterator();
			while(i.hasNext())
			{
				System.out.println(i.next());
			}
			i.remove();
			System.out.println(color); //last element got removed
	}

}
