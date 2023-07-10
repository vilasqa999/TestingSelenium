package Java_Programs;

public class sumofarray 
{

	public static void main(String[] args) 
	{

        int a[]= {1,2,3,4,5,6,10};
        int sum=0;
        
//        for(int i=0;i<a.length;i++)
//        {
//        	sum=sum+a[i];
//        }
//        System.out.println("sum of array..." + sum);
//    
        
        for(int arraysum:a)
        {
        	sum=sum+arraysum;
        }
        System.out.println("sum of array using enhanced for loop.." + sum);
	}

}
