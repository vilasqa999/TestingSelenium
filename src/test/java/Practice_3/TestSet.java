package Practice_3;

import java.util.HashSet;
import java.util.Iterator;

public class TestSet 
{

	public static void main(String[] args) 
	{


		HashSet set1=new HashSet();
		
		set1.add("Java");
		set1.add("selenium");
		set1.add("git");
		
		set1.add("Java");
		
		System.out.println("Hashset element: " + set1);
		
		Iterator it=set1.iterator();
		
		while(it.hasNext())
		{
			System.out.println("Set using iterator " + it.next());
		}
	}

}
