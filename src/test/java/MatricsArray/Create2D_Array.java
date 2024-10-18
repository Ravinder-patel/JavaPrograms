package MatricsArray;

import java.util.Arrays;

import org.testng.annotations.Test;

public class Create2D_Array {
	/* 24. WAP to create a 2D array(Matrix) */
	@Test
	public void create2D_Array() {
		int[][] arr = new int[2][3];
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 3; j++) {
				arr[i][j] = i + j;

			}

		}
		System.out.println(Arrays.deepToString(arr)); // deepToString() will print the result in array format

	}

}
