package functions;

public class Functions1 {

	// Access Modifier, Type of function, Return Type, Name of function and
	// arguments
	public static void main(String[] args) {

		int a = Sum(10, 20);
		int b = Sum(30, 50);
		System.out.println(a + b);

		// Calling non static function of another class
		NonStaticFunctions object = new NonStaticFunctions();
		System.out.println(object.Sum(11, 22));
	}

	// public static void Sum(int a,int b)
	// {
	// int sum=a+b;
	//
	// System.out.println(sum);
	// }

	public static int Sum(int a, int b) {
		int sum = a + b;

		System.out.println(sum);

		return sum;

	}

}
