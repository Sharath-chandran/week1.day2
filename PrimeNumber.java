package week1.day2;

public class PrimeNumber {
	public static void main(String[] args) {
		int Num = 13;
		boolean flag = false;
		for (int i = 2; i <= Num / 2; i++) {
			int rem = Num % i;
			while (rem == 0) {
				flag = true;
				break;
			}
		}

		if (flag == true) {
			System.out.println("Given number is not a prime number");
		} else
			System.out.println("Given number is a prime number");

	}
}
