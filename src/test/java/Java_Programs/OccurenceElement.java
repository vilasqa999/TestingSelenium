package Java_Programs;

public class OccurenceElement {

	public static void main(String[] args) 
	{

     String str="Java is automation language used with selenium";
     
     int count=str.length();
     int count2	=str.replace("s", "").length();
		
		
		int finalcount=count-count2;
		System.out.println("no of times:" + finalcount);
		
	}

}
