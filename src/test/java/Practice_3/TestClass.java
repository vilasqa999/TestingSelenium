/**
 * 
 */
package Practice_3;
public class TestClass 
{
	
	
	static int no=90;
	static String name="Vilas";
	
	
	int id;
	int deptno;
	String deptname;
	private TestClass()
	{
		
		id=100;
		
	}
	TestClass(int no1, String deptn)
	{
		deptno=no1;
		deptname=deptn;
	}
	
	public static void display()
	{
	System.out.println("RollNo: " + no + " name is: " + name);
	}
	
	//static int

	public static  void  main(String[] args)
	{
 
		TestClass t1=new TestClass();
		
		TestClass t2=new TestClass(222,"software");
		
		//t1.display();
		System.out.println("Value of id " + t1.id);
		
		System.out.println("deptname " + t2.deptname + ' ' + "deptno is" + t2.deptno );
		
		
		display();
	}

}
