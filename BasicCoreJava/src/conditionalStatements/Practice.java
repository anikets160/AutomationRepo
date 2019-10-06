package conditionalStatements;

public class Practice {

	public static void main(String[] args) {
		
		for (int row = 1; row <=4; row++) {
			for (int col = 1; col <=row; col++) {
				
				System.out.print("* ");
			}
			System.out.println();
		}
		
		System.out.println("################################");
		
		for (int row1 = 4; row1 >=1; row1--) {
			for (int col1 = row1; col1 >=1; col1--) {
				
				System.out.print("* ");
			}
			System.out.println();
		}

	}

}
