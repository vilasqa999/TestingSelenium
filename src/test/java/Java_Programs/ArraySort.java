package Java_Programs;

import java.util.Arrays;

public class ArraySort {

	public static void main(String[] args) 
	{
		
		int a[]= {2,5,3,87,54,40,23};
		
		int n=a.length;
		
		System.out.println("size of array:" + n);
		
		System.out.println("array elements.." + Arrays.toString(a));
		
		Arrays.parallelSort(a);
		
		System.out.println("array elements using methods.." + Arrays.toString(a));
		
        Arrays.sort(a);
		
		System.out.println("array elements using sort methods.." + Arrays.toString(a));
		for(int i=0 ;i<n-1; i++)
		{
			for(int j=0;j<n-1;j++)
			{
				if(a[j]>a[j+1])
				{
					int temp=0;
					temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
				//System.out.println("sorted array.." + a[i]);
			}
		}
       
		System.out.println("array elements.." + Arrays.toString(a));
		
		
	}

}
