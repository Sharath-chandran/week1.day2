package week1.day2;

public class ConditionalStatements {

	// Print the Number from 1 to 100

	public static void main(String[] args) {

		for (int i = 1; i <= 100; i++) {
			System.out.println(i);
		}

		// Print the Odd Numbers from 1 to 100

		for (int i = 1; i <= 100; i++) {
			if (i % 2 != 0) {
				System.out.println(i);
			}
		}
		// Print the Squares of even numbers from 59 - 38

		for (int i = 59; i >= 38; i--) {
			if (i % 2 == 0) {
				System.out.println(i * i);
			}
		}

		// Print the Sum of the numbers

		int range = 0;
		for (int i = 1; i <= 10; i++) {
			range = range + i;
		}
		System.out.println(range);
	}

}
