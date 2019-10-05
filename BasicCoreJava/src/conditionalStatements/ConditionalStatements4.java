package conditionalStatements;

public class ConditionalStatements4 {

	public static void main(String[] args) {


		int a =70;
		int b =10;
		int c=20;
		
		//Nested IF
		if(a>b)
		{
			if(a>c){
				System.out.println("a is greatest");
			}else{
				System.out.println("c is greatest");
			}
		}else if (b>c) {
			System.out.println("b is greatest");
		}else{
			System.out.println("c is greatest");
		}
		
	}

}
