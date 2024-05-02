package basicJava;

 public class SecondClass 
{

	 int a = 30;  //global variable
	 
	
	
	public void printVal()
	{
		final int a = 20;   // local variable //constant
		//a=50;
		char b = 'X';
		
		System.out.println(a);  //20
		System.out.println(b);
		
	}
	
	public void anotherMeth()
	{
		
		System.out.println(a);  //30
	}
	
	
	public static void main(String[] args)
	{
	
		SecondClass sc = new SecondClass();
		sc.printVal();
		sc.anotherMeth();
		
		FirstClass fc = new FirstClass();
		fc.simpleMethod();
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
