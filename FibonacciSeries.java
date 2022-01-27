package week1.day2;

public class FibonacciSeries {
	public static void main(String[] args) {
		int range = 8;
		int firstNum = 0;
		int secNum = 1;
		System.out.println("Fibonacci series");
		for (int i = 1; i <= range; ++i) {
			int thirdNum = firstNum + secNum;
			firstNum = secNum;
			secNum = thirdNum;
			System.out.println(thirdNum);
		}
	}
}

/*
 * class Main { public static void main(String[] args) {
 * 
 * int n = 10, firstTerm = 0, secondTerm = 1;
 * System.out.println("Fibonacci Series till " + n + " terms:");
 * 
 * for (int i = 1; i <= n; ++i) { System.out.print(firstTerm + ", ");
 * 
 * // compute the next term int nextTerm = firstTerm + secondTerm; firstTerm =
 * secondTerm; secondTerm = nextTerm; } } }
 */