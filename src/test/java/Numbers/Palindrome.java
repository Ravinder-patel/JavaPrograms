package Numbers;

import java.util.Scanner;

import org.testng.annotations.Test;

public class Palindrome {
	@Test
	public void palindrome() {
		System.out.println("Enter a number to check it is polindrome or not: ");
		int num = new Scanner(System.in).nextInt();
		int num2 = num;
		int num3 = num;

		int count = 0;
		while (num != 0) {
			count++;
			num = num / 10;
		}

		int upperLimit = count;

		int rem = 0;
		int sum = 0;
		for (int i = 0; i < upperLimit; i++) {
			rem = num2 % 10;
			sum = sum * 10 + rem;
			num2 = num2 / 10;
		}

		System.out.println(sum);

		if (num3 == sum) {
			System.out.println("Given : " + num3 + " :is polindrome");
		} else {
			System.out.println("Given : " + num3 + " :is not polindrome");
		}

	}

	@Test
	public void palindrome2() {

		System.out.println("Enter a number to check it is polindrome or not: ");
		int num = new Scanner(System.in).nextInt();
		int copy = num;
		String rev = "";
		while (num != 0) {
			rev = rev + num % 10;
			num = num / 10;
		}
		int actNumber = Integer.parseInt(rev);
		if (actNumber == copy) {
			System.out.println(copy + " : Is a polindrome");

		} else {
			System.out.println(copy + " : Is not a polindrome");
		}
	}

	@Test
	public void palindrome3() {

		System.out.println("Enter a number to check it is polindrome or not: ");
		int num = new Scanner(System.in).nextInt();
		int num2 = num;
		int sum = 0;

		while (num != 0) {
			int rem = num % 10;
			sum = sum * 10 + rem;
			num = num / 10;
		}

		if (sum == num2) {
			System.out.println(num2 + " : Is a polindrome");

		} else {
			System.out.println(num2 + " : Is not a polindrome");
		}
	}

}
