package Java_Programs;

public class Largest {

	public static void main(String[] args)
	{

     int a=10,b=380,c=32;
     
//     if(a>b && a>c)
//     {
//    	 System.out.println("A is largest");
//     }
//     
//     else if(b>a && b>c)
//     {
//    	 System.out.println("b is largest");
//     }
//		
//     else
//     {
//    	 System.out.println("c is largest");
//     }
     
    int large= a>b?a:b;
    int largest=large>c?large:c;
		
    System.out.println("Largest no is:" + largest);
	}

}
