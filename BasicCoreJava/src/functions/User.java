package functions;

public class User {

	public static void main(String[] args) {

		Car car1 = new Car();
		car1.brand = "BMW";
		car1.wheels = 5;
		car1.colour ="BLACK";
		car1.model ="Sedan";		
		car1.powerSteering();
		car1.lookAndFeel();
		
		System.out.println();
		
		Car car2 = new Car();
		//car2.brand = "HONDA";
		car2.wheels = 4;
		car2.colour ="WHITE";
		car2.model ="SUV";		
		car2.powerSteering();
		car2.lookAndFeel();
		
	}

}
