package Practice_3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class TestArraylist
{

	public static void main(String[] args) 
	{

		ArrayList al=new ArrayList();
		
		al.add("Manaul Testing");
		al.add("Java");
		al.add("Selenium");
		al.add("Framework");
		al.add("Postman");
		al.add("git");
		al.add("jira");
		al.add("jenkins");
		
		System.out.println("List of element: "+ al);
		
		System.out.println("Size of arraylist: " + al.size());
		
	    al.remove(4);
		
        System.out.println("After remove List of element: "+ al);
		
		System.out.println(" after Size of arraylist: " + al.size());
		
		System.out.println("contains partial " +al.contains("gi"));
		System.out.println("contains capital check " +al.contains("JIRA"));
		System.out.println("contains exact check " +al.contains("jenkins"));
		//al.contains("jenkins");
		
		al.add(7, "sql");
		

        System.out.println("After remove List of element: "+ al);
		
		System.out.println(" after Size of arraylist: " + al.size());
		
		al.set(3, "Testng+ cucumber");

        System.out.println("After remove List of element: "+ al);
		
		System.out.println(" after Size of arrayl ist: " + al.size());
		

		System.out.println(" element at 5 position : " + al.get(4));
		
		//al.clear();
		
		    System.out.println("After remove List of element: "+ al);
			
			System.out.println(" after Size of arraylist: " + al.size());
			
			
			ArrayList al2=new ArrayList();
			al2.addAll(al);
			
			System.out.println("Collection 2 is : " + al2);
			
			int num=al2.size();
			
			//for(int i=0;i<num;i++)
			{
			//	System.out.println("collection element : " + al2.get(i));
			}
			
			for(Object s:al2)
			{
			//	System.out.println("collection element using for each loop"+ s);
			}
			
			
			Iterator it=al2.iterator();
			
			for(int i=0;i<num;i++)
			{
				System.out.println("use iterator for loop " + it.next());
			}
		 while(it.hasNext())
		 {
		//	 System.out.println("using iterator "+ it.next());
			 
		 }
		 
		 // now sort
		 
		 System.out.println("before sort...." + al2);
		 Collections.sort(al2);
		 
		 System.out.println("after sort...." + al2);
		 
		 Collections.shuffle(al2);
		 System.out.println("after shuffle...." + al2);
		 
		 Collections.sort(al2, Collections.reverseOrder());

		 System.out.println("reverse order  sort...." + al2);
		 
	}

}
