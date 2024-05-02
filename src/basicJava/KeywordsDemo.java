package basicJava;

public class KeywordsDemo 
{

	static int a = 20;  //global variable
	
	public static void printVar()
	{
		
		System.out.println(a);  //30
		//System.out.println(this.a);  //20
	}
	
	
	public void printval()
	{
		System.out.println("this is not static method");
	}
	
	public static void main(String[] args)
	{
	
		
		KeywordsDemo.printVar();
	
	
	}
	
}
