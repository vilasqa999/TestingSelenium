package Practice_3;




interface test
{
	
	int age=20;
	void display();
	
}

public class testinterface  implements test
{
	
	public void display()
	{
		System.out.println("this is interfece method");
	}
	public void displayage()
	{
		System.out.println("age is " + age );
	}

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

		testinterface f1=new testinterface();
		f1.display();
		f1.displayage();
	}

}
