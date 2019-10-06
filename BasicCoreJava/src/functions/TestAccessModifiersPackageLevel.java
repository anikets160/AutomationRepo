package functions;

public class TestAccessModifiersPackageLevel {

	public static void main(String[] args) {
		
		AccessModifiers obj = new AccessModifiers();
		obj.publicFunction();
		obj.protectedFunction();
		obj.noAccessModifierFunction();
		
	}

}
