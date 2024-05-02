package basicJava;

public class QA2 extends QA1
{
	int x = 200;
	
	public void callSum()
	{
		System.out.println(super.x); //100
		
		super.sum(20, 30);
	}

	public void sum(int a, int b)
	{
		int c = a*a+b*b;
		System.out.println("sum of a&b: " + c);
		System.out.println(x); //200
		
	
	}
	
	public void sum(float a, int b)
	{
		float c = a*a+b*b;
		System.out.println("sum of a&b: " + c);
	}
	
	
	public void sub(int a, int b)
	{
		int c = a-b;
		System.out.println("sub of a&b: " + c);
	}
	
	
	public static void main(String[] args) 
	{
	
		QA2 q2 = new QA2();
		
		q2.sub(30, 20);
		q2.sum(20, 30);
		q2.callSum();
		
	}

	
	public void qa1im() {
		System.out.println("this is method of QA1I");
		
	}
	
	
	
	
	
}
