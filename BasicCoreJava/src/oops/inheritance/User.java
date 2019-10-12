package oops.inheritance;

public class User {

	public static void main(String[] args) {

		Smartphone smartphone = new Smartphone();
		smartphone.internet();
		smartphone.calling();
		smartphone.texting();
		
		Telephone telephone = new Telephone();
		telephone.calling();
		
		// Parent class reference and child class object
		telephone = new Mobile();
		telephone.calling();
		//telephone.extra();
	}

}
