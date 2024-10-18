package Patterns;

import org.testng.annotations.Test;

public class TranglePatterns {
	/**/
	@Test
	public void rightAngleTraingle() {
		int num = 5;
		for (int i = 0; i < num; i++) {
			for (int j = 0; j < num; j++) {
				if (i >= j) {
					System.out.print("* ");
				} else {
					System.out.print("  ");
				}
			}
			System.out.println();

		}
	}

	@Test
	public void reversedRightAngleTraingle() {
		int num = 5;
		for (int i = 0; i < num; i++) {
			for (int j = 0; j < num; j++) {
				if (i <= j) {
					System.out.print("* ");
				} else {
					System.out.print("  ");
				}
			}
			System.out.println();

		}
	}

	/**/
	@Test
	public void rightAngleTraingleLeft() {
		int num = 5;
		for (int i = 1; i <= num; i++) {
			for (int j = 1; j <= num; j++) {
				if (i + j > num) {
					System.out.print("* ");
				} else {
					System.out.print("  ");
				}
			}
			System.out.println();

		}
	}

	/**/
	@Test
	public void reversedrightAngleTraingleLeft() {
		int num = 5;
		for (int i = 1; i <= num; i++) {
			for (int j = 1; j <= num; j++) {
				if (i + j <= num + 1) {
					System.out.print("* ");
				} else {
					System.out.print("  ");
				}
			}
			System.out.println();

		}
	}
	/**/
	@Test
	public void basicTriangle() {
		int num = 5;
		for (int i = 1; i <= num/2+1; i++) {
			for (int j = 1; j <= num; j++) {
				if (i + j >= num-1 && j-i<num/2) {
					System.out.print("* ");
				} else {
					System.out.print("  ");
				}
			}
			System.out.println();

		}
	}
}
