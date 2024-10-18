package MatricsArray;

import org.testng.annotations.Test;

public class MatricsArray {
	@Test
	public void twoByTwo() {
		int[][] a = { { 1, 2 }, { 3, 4 } };
		int[][] b = { { 1, 2, 3 }, { 3, 4, 5 } };
		int[][] c = new int[a.length][b[0].length];

		for (int i = 0; i < a.length; i++) {

			for (int j = 0; j < b[0].length; j++) {

//				c[i][j] = 0;

				for (int k = 0; k < a[0].length; k++) {

					c[i][j]+=   a[i][k] * b[k][j];

				}
				System.out.print(c[i][j] + " ");
			}
			System.out.println();

		}
	}

}
