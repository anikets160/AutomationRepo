package functions;

public class MethodOverloading {

//	Method Overloading:
//		Same method name but with different parameters. This is a must condition.
//		Others things can be changed or not changed. It does not matter.

	public static void main(String[] args) {
		
		MethodOverloading obj = new MethodOverloading();
		obj.sum(10, 30);
		
	}

	public void sum(int a , int b)
	{
		System.out.println(a+b);
	}
	
	public void sum(int a , int b,int c)
	{
		System.out.println(a+b+c);
	}
	
	private static int sum(int a , int b,String c)
	{
		System.out.println(a+b+c);
		return 1;
	}
		
}
