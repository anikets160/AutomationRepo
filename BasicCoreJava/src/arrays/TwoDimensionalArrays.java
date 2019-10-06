package arrays;

public class TwoDimensionalArrays {

	public static void main(String[] args) {

		// Two Dimensional Arrays

		String[][] tableData = new String[5][2];

		// 5 Rows and 2 Columns
		// Row1
		tableData[0][0] = "Username";
		tableData[0][1] = "Password";

		// Row2
		tableData[1][0] = "Username1";
		tableData[1][1] = "Password1";

		// Row3
		tableData[2][0] = "Username2";
		tableData[2][1] = "Password2";

		// Row4
		tableData[3][0] = "Username3";
		tableData[3][1] = "Password3";

		// Row5
		tableData[4][0] = "Username4";
		tableData[4][1] = "Password4";

		System.out.println("Printing 2-D Array");

		System.out.println(tableData.length);
		System.out.println(tableData[0].length);
		System.out.println(tableData[1].length);
		System.out.println(tableData[2].length);
		System.out.println(tableData[3].length);
		System.out.println(tableData[4].length);
			
		// Nested For Loop
		for (int row = 0; row < tableData.length; row++) {
			for (int col = 0; col < tableData[row].length; col++) {

				System.out.print(tableData[row][col] + "  ");
			}
			System.out.println();
			System.out.println();

		}
	}
}
