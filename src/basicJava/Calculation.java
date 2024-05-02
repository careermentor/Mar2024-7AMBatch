package basicJava;

public class Calculation 
{
	
	
	public int addiion()
	{
		int a = 20;
		int b = 30;
		int c = a+b;
		
		System.out.println("this is addition of a&b: " + c);
		return c;
	}
	
	public int sum(int a, int b)
	{
		int c = a+b;
		System.out.println("sum of a&b: " + c);
		return c;
	}
	
	//30+40+50
	//x=30+40
	//x+50
	

	public Calculation(int a, int b)
	{
		
		int c = a*b;
		System.out.println("mul of a&b: " + c);
		
	}
	

	
	public Calculation()
	{
		System.out.println("this is constructor");
	}
	
	public static void main(String[] args) 
	{
		Calculation cal = new Calculation(50,60); //constructor will be automatically called
		
		Calculation cal1 = new Calculation();
		
		cal.addiion();
		cal1.sum(20, 30);
		int x = cal.sum(30, 40);
		cal.sum(x, 50);
		
		int y = cal.addiion(); //50
		cal.sum(y, 100);
		
	}
	
	
}
