package conditionalStatements;

import java.util.Scanner;

public class LogicalOperators2 {

	public static void main(String[] args) {
		
		//OR ||
		
		int cet =128;
		int IIT = 30;
		
		//Scanner scanner = new Scanner(System.in);
		//System.out.println("Enter your CET score");
		//int cet = scanner.nextInt();
		
		if(cet>=80 || IIT>=40)
		{
			System.out.println("You are eligible");
		}else{
			System.out.println("You are NOT eligible");
		}

	}

}
