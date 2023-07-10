package Practice_3;

  abstract class Car
{
	abstract void run();
	
	void start()
	{
		System.out.println("This is start");
	}
	
	void stop()
	{
		System.out.println("This is stop");
	}
	
}
  
  class Tata extends Car
 {

	@Override
	void run() 
	{

		System.out.println("This is run");
		
	}
	 
 }

  
 
 
public class AbstractDemo
{
	public static void main(String args[])
	{
		Tata t=new Tata();
		t.run();
		t.start();
		t.stop();
	}
	

}
