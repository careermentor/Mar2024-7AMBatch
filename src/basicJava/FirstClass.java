package basicJava;

public class FirstClass 
{
	int f = 200;
	
	public void simpleMethod()
	{
		int abc = 100;
		System.out.println(abc);
	}
	
	public static void main(String[] args)   //main method
	{
		int a = 10;   //variable
		float b = 10.5f;
		char c = 'X';
		String d = "Java";
		boolean e = false;
		
		System.out.println(a);  //print statement
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
		
		FirstClass xyz = new FirstClass();  
		
		
		xyz.simpleMethod();
		System.out.println(xyz.f);

	}

}
