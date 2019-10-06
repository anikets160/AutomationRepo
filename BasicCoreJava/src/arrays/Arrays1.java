package arrays;

public class Arrays1 {

	public static void main(String[] args) {

		// Arrays: Homogeneous group of elements

		// One-Dimensional Array
		String[] str = new String[13];

		str[0] = "Aniket";
		str[1] = "Pramila";
		str[2] = "Srishti";
		str[3] = "Ganesh";
		str[4] = "Jaywant";
		str[5] = "Prajyot";
		str[6] = "Soumya";
		str[7] = "Jyoti";
		str[8] = "Seema";
		str[9] = "Pratik";
		str[10] = "Ashutosh";
		str[11] = "Nikhil";
		str[12] = "Ayesha";

		System.out.println(str[4]);
		System.out.println("#######");

		System.out.println(str.length);
		System.out.println("#######");

		for (int i = 0; i < str.length; i++) {
			System.out.println(str[i]);
		}

		System.out.println("#######");

		// Enhanced FOR LOOP or FOR EACH LOOP
		for (String s : str) {
			System.out.println(s);
		}

	}

}
