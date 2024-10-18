package Patterns;

import org.testng.annotations.Test;

public class Hearts {
	@Test
	public void heartPattern() {
		String heart = "";

		for (int i = 0; i < 10; i++) {
			System.out.println(heart);
			heart = heart + " ♪";
		}
	}

	@Test

	public void heart() {
		int n = 6; // Adjust the size of the heart

		// Top part of the heart
		for (int i = n / 2; i <= n; i += 2) {
			for (int j = 1; j < n - i; j += 2) {
				System.out.print(" ");
			}
			for (int j = 1; j <= i; j++) {
				System.out.print("♥");
			}
			for (int j = 1; j <= n - i; j++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= i; j++) {
				System.out.print("♥");
			}
			System.out.println();
		}

		// Bottom part of the heart
		for (int i = n; i >= 1; i--) {
			for (int j = i; j < n; j++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= (i * 2) - 1; j++) {
				System.out.print("♥");
			}
			System.out.println();
		}
	}

}
