package week1.day2;

public class StringPalindrome {
	public static void main(String[] args) {
		String name = "Malayalam";
		String reverse = " ";
		int length = name.length();

		for (int i = length - 1; i >= 0; i--) {
			reverse = reverse + name.charAt(i);
			System.out.println(name.charAt(i));

		}
	}
}
