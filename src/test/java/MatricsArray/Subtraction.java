package MatricsArray;

import org.testng.annotations.Test;

public class Subtraction {
	@Test
	public void subtractionOfMatrics() {
		int[][] a = { 
				{ 10, 20 }, 
				{ 30, 40 } };
		int[][] b = { 
				{ 1, 2 }, 
				{ 3, 4 } };
		int[][] c = new int[a.length][b[0].length];
		
		for (int i = 0; i < a.length; i++) {

			for (int j = 0; j < b.length; j++) {

				c[i][j] = a[i][j]-b[i][j];
				System.out.print(c[i][j] + " ");
			}
			System.out.println();
		}
	}

}
