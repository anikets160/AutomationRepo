package conditionalStatements;

public class LogicalOperators1 {

	public static void main(String[] args) {
		
		//AND &&
				
		int age =64;
		int salary = 5000;
		
		if((age>=18 && age<65) && salary >=3000)
		{
			System.out.println("You are eligible");
		}else{
			System.out.println("You are NOT eligible");
		}

	}

}
