package Numbers;

import java.util.Scanner;

import org.testng.annotations.Test;

public class ReverseTheNumber {
	@Test
	public void reverseTheNumber() {

		int num = 123456;
		int res = 0;
		while (num != 0) {
			int rem = num % 10;
			res = res * 10 + rem;
			num = num / 10;
		}
		System.out.println("reverse of given number is :  " + res);
	}

}
