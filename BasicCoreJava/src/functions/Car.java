package functions;

public class Car {

	String colour;
	static int wheels=4;
	String model;
	String brand;
	
	public void powerSteering()
	{
		System.out.println("All "+wheels+" wheels support power steering");
	}
	
	public void lookAndFeel()
	{
		System.out.println(brand +" has "+colour+" colour in "+model+" cars");
	}
}
