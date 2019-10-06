package functions;

public class AccessModifiers {
	
//	public
//	private
//	protected
//	NoAceesModifier or Default
	
//		Access Modifiers:
//		-Public   - throughout the project
//		-Private   - Within the class/block
//		-Protected – within the package and by using child class can be accessed throughout the project
//		-Default or No Access Modifier – within the package

	public static void main(String[] args) {
		AccessModifiers obj = new AccessModifiers();
		obj.publicFunction();
		obj.privateFunction();
		obj.noAccessModifierFunction();
		obj.protectedFunction();
	}
	
	
	public void publicFunction()
	{
		System.out.println("publicFunction");
	}
	
	private void privateFunction()
	{
		System.out.println("privateFunction");
	}
	
	protected void protectedFunction()
	{
		System.out.println("protectedFunction");
	}
	
	void noAccessModifierFunction()
	{
		System.out.println("noAccessModifierFunction");
	}
	

}
