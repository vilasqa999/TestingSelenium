package Practice_3;




class A
{
	void run()
	{
		System.out.println("run in A class");
	}
}


class B extends A
{

	void run()
	{
		System.out.println("run in B class");
	}
}






public class inheritance1 
{

	public static void main(String[] args)
{
		
		
		B b1=new B();
		
		A a1=new A();
		a1.run();
		b1.run();
		// TODO Auto-generated method stub

	}

}
