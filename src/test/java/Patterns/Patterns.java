package Patterns;

import org.testng.annotations.Test;

public class Patterns {
	@Test
	public void rightAngleTriangleRight() {
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				if (i >= j) {
					System.out.print("♥ ");
				} else {
					System.out.print("  ");
				}

			}
			System.out.println();

		}
	}

	@Test
	public void rightAngleTriangleLeft() {
		for (int i = 0; i < 4; i++) {
			for (int j = 4 - 1; j >= 0; j--) {
				if (i + j >= 3) {
					System.out.print("♥  ");
				} else {
					System.out.print("  ");
				}

			}
			System.out.println();

		}
	}

	@Test
	public void pascalTriangle() {
		int space = 5;
		int pair = 1;
		for (int i = 0; i <= 5; i++) {
			for (int j = 1; j <= space; j++) {
				System.out.print("  ");
			}
			int x = 1;
			int nm = i;
			int dm = 1;
			for (int k = 1; k <= pair; k++) {
				System.out.print(x + "   ");
				x = (x * nm) / dm;
				nm--;
				dm++;
			}
			space--;
			pair++;
			System.out.println();
		}

	}

	@Test
	public void printPascalTriangle2() {
		int initialSpaces = 5; // Controls the initial spaces before the first number in each row
		int elementsInRow = 1; // Number of elements in the current row

		for (int i = 0; i <= 5; i++) {
			// Print leading spaces for the current row
			for (int j = 1; j <= initialSpaces; j++) {
				System.out.print("  ");
			}

			int value = 1; // Initial value to be printed in the row (always starts with 1)
			int numerator = i; // Numerator for computing binomial coefficient
			int denominator = 1; // Denominator for computing binomial coefficient

			// Print all elements in the current row
			for (int k = 1; k <= elementsInRow; k++) {
				System.out.print(value + "   ");
				value = (value * numerator) / denominator;
				numerator--;
				denominator++;
			}

			initialSpaces--; // Decrease the leading spaces for the next row
			elementsInRow++; // Increase the number of elements for the next row
			System.out.println();
		}
	}

}
