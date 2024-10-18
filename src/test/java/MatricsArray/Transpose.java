package MatricsArray;

import org.testng.annotations.Test;

public class Transpose {
	@Test
	public void transposeOfMatrix() {
		int[][] a = { { 1, 2, 5, 5 },
					  { 3, 4, 6, 7 },
					  { 2, 5, 6, 7 } };
		int[][] c = new int[a[0].length][a.length];

		for (int i = 0; i < a[0].length; i++) {

			for (int j = 0; j < a.length; j++) {

				c[i][j] = a[j][i];
				System.out.print(c[i][j] + " ");
			}
			System.out.println();
		}

	}
	
	@Test
	public void transposeOfMatrix2() {
		int[][] a = { { 1, 2, 5, 5 },
					  { 3, 4, 6, 7 },
					  { 2, 5, 6, 7 } };
		int[][] c = new int[a[1].length][a.length];

		for (int i = 0; i < a[0].length; i++) {

			for (int j = 0; j < a.length; j++) {

				c[i][j] = a[j][i];
				System.out.print(c[i][j] + " ");
			}
			System.out.println();
		}

	}
}
