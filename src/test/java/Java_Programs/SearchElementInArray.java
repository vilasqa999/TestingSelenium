package Java_Programs;

public class SearchElementInArray {

	public static void main(String[] args) 
	{
	
		int a[]= {10,20,30,40,50,60};
		int searchelement=400;
		
		int arraysize=a.length;
		System.out.println("array size..."+ arraysize);
	    boolean flag=false;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==searchelement)
			{
				System.out.println("Element found...." + a[i]);
				flag=true;
			}
		}
		
		if(flag==false)
		{
			System.out.println("Element not found...." );
		}
		

	}

}
