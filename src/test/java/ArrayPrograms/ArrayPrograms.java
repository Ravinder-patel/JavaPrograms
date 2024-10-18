package ArrayPrograms;

import java.util.Arrays;
import java.util.Scanner;

import org.testng.annotations.Test;

/**
 * @author Ravinder {@link #printArrayElementsInReverse2()}
 * 
 *         <pre>
 * lear before start
 *         </pre>
 */
public class ArrayPrograms {

	Scanner scan = new Scanner(System.in);

	/* 1. WAP to find the length of an Array or size of an array */
	@Test
	public void lengthofArray() {
		int[] a = { 10, 20, 30, 40, 50 };
		System.out.println(a.length);

	}

	/* 4. WAP to find the average of the elements in a given Array */
	@Test
	public void averageOfElementsInArray() {
		int[] a = { 10, 20, 30, 40, 50 };

		int res = 0;
		for (int i = 0; i < a.length; i++) {

			res = res + a[i];
		}

		System.out.println("Average of given array is : " + res / a.length);

	}

	/*
	 * 5. WAP to copy one Array elements to another Array in the reverse order
	 */
	@Test
	public void printArrayElementsInReverse() {
		int[] a = { 10, 20, 30, 40, 50 };
		int[] arr = new int[a.length];

		for (int i = 0; i < a.length; i++) {

			arr[i] = a[a.length - i - 1];

		}
		System.out.print(Arrays.toString(arr));

	}

	@Test
	public void printArrayElementsInReverse2() {
		int[] a = { 10, 20, 30, 40, 50 };
		int[] arr = new int[a.length];
		int num = 0;
		for (int i = a.length - 1; i >= 0; i--) {

			arr[num] = a[i];
			num++;

		}
		System.out.print(Arrays.toString(arr));

	}

	/* 6. WAP to merge two Array elements */
	@Test
	public void mergeTwoArrayElements() {
		int[] a1 = { 10, 20 };
		int[] a2 = { 6, 7, 8, 9, 10 };
		int[] mergeArray = new int[a1.length + a2.length];

		System.out.println("Merged array elements");

		for (int i = 0; i < mergeArray.length; i++) {

			if (i < a1.length) {
				mergeArray[i] = a1[i];
				System.out.println(mergeArray[i]);
			} else {
				mergeArray[i] = a2[i - a1.length];
				System.out.println(mergeArray[i]);
			}

		}
		System.out.println(Arrays.toString(mergeArray));

	}

	/* 6. WAP to merge two Array elements=======another logic */
	@Test
	public void mergeTwoArrayElements2() {
		int[] a1 = { 1, 2 };
		int[] a2 = { 6, 7, 8, 9, 10 };
		int[] mergeArray = new int[a1.length + a2.length];

		System.out.println("Merged array elements");

		int index = 0;
		for (int x1 : a1) {
			mergeArray[index] = x1;
			System.out.println(mergeArray[index]);
			index++;

		}
		for (int x2 : a2) {
			mergeArray[index] = x2;
			System.out.println(mergeArray[index]);
			index++;
		}

	}

	/*
	 * WAP to find whether the given element is present in an Array or not (Linear
	 * Search)
	 */
	@Test
	public void findElementInArray() {
		int[] a2 = { 6, 7, 8, 9, 10 };
		int ele = 1;

		System.out.println("Merged array elements");
		for (int x1 : a2) {
			if (ele == x1) {
				System.out.println(ele + ": is present");
				break;
			} else {
				System.out.println(ele + ": is not present");
				break;
			}

		}

	}

	@Test
	public void findElementInArray2() {
		int[] a = { 1, 2, 3, 6, 5, 4, 10, 5 };
		boolean flag = false;
		System.out.println("Enter a number : ");
		int num = new Scanner(System.in).nextInt();
		for (int i = 0; i < a.length; i++) {
			if (num == a[i]) {
				flag = true;
			}
		}
		if (flag == true) {
			System.out.println("Given number is present in the array");

		} else {
			System.out.println("Given number is not present in the array");
		}

	}
	/*
	 * 8. WAP to perform the left Shift in an Array 9. WAP to perform the left shift
	 * in an Array n number of times (n is user specified value)
	 */

	@Test
	public void leftShiftArray() {

		int[] a = { 1, 2, 3, 4, 5, 6 };

		System.out.println("left shift array elements");
		System.out.println("Enter number of left Shifts : ");
		int shifts = scan.nextInt();

		for (int i = 0; i < shifts; i++) {

			int temp = a[0];

			for (int j = 1; j < a.length; j++) {
				a[j - 1] = a[j];
			}
			a[a.length - 1] = temp;
			// System.out.println(Arrays.toString(a));
		}
		System.out.println(Arrays.toString(a));

	}

	/*
	 * 10. WAP to perform the right Shift in an Array 11. WAP to perform the Right
	 * shift in an Array n number of times (n is user specified value)
	 */

	@Test
	public void rightShiftArray() {
		int[] arr = { 10, 20, 30, 40, 50 };

		System.out.println("right shift array elements");
		System.out.println("Enter number of right Shifts : ");
		int shifts = scan.nextInt();
//		int shifts = 2;

		for (int i = 0; i < shifts; i++) {

			int temp = arr[arr.length - 1];// == 4th index

			for (int j = arr.length - 2; j >= 0; j--) {
				arr[j + 1] = arr[j];
			}
			arr[0] = temp;

		}
		System.out.println(Arrays.toString(arr));
	}

	/* 12. WAP to remove the duplicate elements from a given Array */
	@Test
	public void removeDuplicatesfromArray() {
		int[] arr = { 10, 20, 10, 40, 20, 20 };
		for (int i = 0; i < arr.length - 1; i++) {
			int count = 0;

			for (int j = 0; j <= i; j++) {

				if (arr[i] == arr[j]) {

					count++;
				} else {

				}
			}
			if (count == 1) {
				System.out.println(arr[i]);

			}
		}
	}

	/* 13. WAP to print the duplicate elements present in a given Array */
	@Test
	public void printDuplicatesfromArray() {
		int[] arr = { 10, 20, 10, 40, 20, 10, 10, 10, 10 };

		for (int i = 0; i < arr.length; i++) {

			int count = 0;

			for (int j = 0; j < arr.length; j++) {

				if (arr[i] == arr[j] && i > j) {
					break;
				} else if (arr[i] == arr[j]) {
					count++;
				}
			}
			if (count >= 1) {
				System.out.println(arr[i]);

			}
		}
	}

	@Test
	public void printDuplicatesfromArray2() {
		int[] arr = { 10, 20, 10, 40, 20, 10, 10, 10, 10 };

		for (int i = 0; i < arr.length; i++) {

			int count = 0;

			for (int j = 0; j <= i; j++) {

				if (arr[i] == arr[j]) {
					count++;
				}
			}
			if (count == 2) {
				System.out.println(arr[i]);

			}
		}
	}

	@Test
	public void printDuplicatesfromArray3() {
		int[] arr = { 10, 20, 10, 40, 20, 10, 10, 10, 10 }; // ===== do this=========
		int[] b = new int[arr.length];
		int value = -1;
		for (int i = 0; i < arr.length; i++) {

			int count = 1;

			for (int j = i + 1; j < arr.length; j++) {

				if (arr[i] == arr[j]) {
					b[j] = value;

				} else {

				}
			}
			if (b[i] == value) {
				System.out.println(b[i]);

			}

		}
	}

	/*
	 * 14. WAP to find the frequency or occurrence of an element in a given Array
	 * (How many times an element is repeated in a given array)
	 */
	@Test
	public void OccurenceOfElementInArray() {
		int[] arr = { 10, 20, 10, 40, 20 };

		for (int i = 0; i <= arr.length - 1; i++) {
			int count = 0;

			for (int j = 0; j < arr.length; j++) {

				if (arr[i] == arr[j] && i > j) {
					break;

				} else if (arr[i] == arr[j]) {
					count++;
				}
			}
			if (count >= 1) {
				System.out.println(arr[i] + " : Occurenece is: " + count);

			}
		}
	}

	/** 15. WAP to print the maximum frequency element in a given Array */
	@Test
	public void maxFrequencyElementInArray() {
		int[] arr = { 1, 6, 6, 6, 6, 4, 4, 1, 5, 6, 4 };

		int maxCount = 0;
		int maxFrequencyElement = 0;

		for (int i = 0; i < arr.length; i++) {

			int count = 0;

			for (int j = i; j < arr.length; j++) {

				if (arr[i] == arr[j]) {

					count++;
				} else {

				}
			}
			if (count > maxCount) {
				maxCount = count;
				maxFrequencyElement = arr[i];

			}
		}
		System.out.println("max frequence element: " + maxFrequencyElement + " : Occurenece is: " + maxCount);
	}

	/* 15.1. WAP to print the maximum frequency element in a given Array */
	@Test
	public void maxFrequencyElementInArray2() {
		int[] arr = { 50, 40, 40, 40, 10, 40, 50, 20, 50, 10, 40, 50 };

		int maxFreqEle = 0;
		int maxCount = 0;

		for (int i = 0; i < arr.length; i++) {
			int count = 0;
			for (int j = 0; j < i; j++) {
				if (arr[i] == arr[j]) {
					count++;

				}
			}
			if (count > maxCount) {
				maxCount = count;
				maxFreqEle = arr[i];

			}

		}
		System.out.println("max frequence element is : " + maxFreqEle);

	}

	/* 16.WAP to sort a given Array in ascending Order */
	@Test
	public void arrayInAscending() {
		int[] arr = { 1, 4, 5, 2, 3 };

		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					// swap
					int temp = arr[j];
					arr[j] = arr[i];
					arr[i] = temp;

				}
			}
			System.out.print(arr[i] + " ");

		}
	}

	/* 17.WAP to sort a given Array in de-scending Order */
	@Test
	public void arrayInDescending() {
		int[] arr = { 1, 3, 5, 2, 4 };

		for (int i = 0; i < arr.length; i++) {

			for (int j = i + 1; j < arr.length; j++) {

				if (arr[i] < arr[j]) {

					// swapping
					int temp = arr[i]; // store greater value in temp
					arr[i] = arr[j]; // less value assigned to arr[i]
					arr[j] = temp;
				}

			}
			System.out.print(arr[i] + " ");
		}
	}

	/*
	 * 18. WAP to swap the first half and the Second Half elements in a given array
	 */
	@Test
	public void swapHalfArray() {
		int[] arr = { 1, 2, 3, 4, 5, 6, 7 };
		int[] arr2 = new int[arr.length];
		for (int i = 0; i < arr.length; i++) {

			for (int j = 0; j < arr.length / 2; j++) {

				// swapping
				int temp = arr[arr.length / 2 + j];
				arr2[arr.length / 2 + j] = arr[j];
				arr2[j] = temp;

			}

		}
		System.out.print(Arrays.toString(arr2) + " ");
	}

	@Test
	public void swapHalfArray2() {
		int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8 };

		int midpoint = arr.length / 2;

		for (int i = 0; i < midpoint; i++) {

			// swapping
			int temp = arr[midpoint + i];
			arr[midpoint + i] = arr[i];
			arr[i] = temp;

		}
		System.out.print(Arrays.toString(arr) + " ");
	}

	@Test
	public void swapHalfArray3() {
		int[] arr = { 1, 2, 3, 4, 5, 6, 7 };

		int midpoint = arr.length / 2;

		for (int i = 0; i < midpoint; i++) {

			if (arr.length % 2 == 0) {
				// if length is even
				int temp = arr[midpoint + i];
				arr[midpoint + i] = arr[i];
				arr[i] = temp;
			} else {
				// if length is odd
				int temp = arr[midpoint + i + 1];
				arr[midpoint + i + 1] = arr[i];
				arr[i] = temp;
			}

		}
		System.out.print(Arrays.toString(arr) + " ");
	}

	/* 19. WAP to find the largest element in a given Array */
	@Test
	public void largestElementInArray() {
		int[] arr = { 1, 2, 10, 4, 5, 6, 7, 15 };

		int maxNum = 0; // arr[0]

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > maxNum) {
				maxNum = arr[i];

			}

		}
		System.out.println(maxNum);
	}

	/* 20. WAP to find the Second largest element in a given Array */
	@Test
	public void secondLargestElementInArray() {
		int[] arr = { 1, 2, 10, 4, 5, 6, 7, 15 };

		int firstMax = 0;
		int secondMax = 0;

		for (int i = 0; i < arr.length; i++) {

			if (arr[i] > firstMax) {
				secondMax = firstMax;
				firstMax = arr[i];
			} else if (arr[i] < firstMax && arr[i] > secondMax) {
				secondMax = arr[i];

			}

		}
		System.out.println("second maximun number is : " + secondMax);
	}

	/* 21. WAP to find the smallest element in a given Array */
	@Test
	public void smallestElementInArray() {
		int[] arr = { 10, 2, 10, 4, 6, 7, 1 };

		int minNum = arr[0];

		for (int i = 0; i < arr.length; i++) {

			if (arr[i] < minNum) {
				minNum = arr[i];
			}
		}
		System.out.println("Minimum number is : " + minNum);
	}

	/* 22. WAP to find the Second smallest element in a given Array */
	@Test
	public void secondSmallestElementInArray() {

		int[] arr = { 10, 2, 10, 4, 6, 7 };

		int firstSmall = arr[0];
		int secondSmall = arr[0];

		for (int i = 0; i < arr.length; i++) {

			if (arr[i] < firstSmall) {
				secondSmall = firstSmall;
				firstSmall = arr[i];
			} else if (arr[i] > firstSmall && arr[i] < secondSmall) {
				secondSmall = arr[i];
			}
		}
		System.out.println("Second Minimum number is : " + secondSmall);
	}

	/* 22. WAP to move all zeroes to the end of an Array */
	@Test
	public void moveZeroesToendOfArray() {

		int[] arr = { 0, 1, 0, 3, 0, 0, 5, 6 };

		int n = 0;

		for (int i = 0; i < arr.length; i++) {

			if (arr[i] != 0) {
				arr[n] = arr[i];
				n++;
			}
		}
		while (n < arr.length) {
			arr[n] = 0;
			n++;
		}
		System.out.println(Arrays.toString(arr));
	}
}
