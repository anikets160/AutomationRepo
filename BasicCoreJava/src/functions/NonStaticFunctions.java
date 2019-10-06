package functions;

public class NonStaticFunctions {

	public static void main(String[] args) {
	
		//Need to create object for calling non static method Sum
		NonStaticFunctions object = new NonStaticFunctions();
		
		System.out.println(object.Sum(4,5));
		
		//Calling static method of other class
		Functions1.Sum(10, 20);

	}
	
	public int Sum(int a,int b)
	{
		return a+b;
	}

}
