package dataTypesAndVariables;

import functions.AccessModifiers;


public class TestAccessModifiersProjectLevel extends AccessModifiers {

	public static void main(String[] args) {
		
		AccessModifiers obj = new AccessModifiers();
		obj.publicFunction();
			
		TestAccessModifiersProjectLevel childClassObject = new TestAccessModifiersProjectLevel();
		childClassObject.protectedFunction();
	}

}
