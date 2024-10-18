package ArraysWithLoops;

import org.testng.annotations.Test;

public class UsingWhileLoop {

	/* print elements in ARRAY */

	int[] a = { 10, 20, 30, 40, 50 };
	char[] ch = { 'A', 'B', 'C', 'D', 'E' };
	String[] s = { "Hyd", "Bang", "kolkata", "delhi", "mumbai" };
	Boolean[] b = { true, false, false, true, true };

	int[] a1 = new int[a.length];
	char[] ch1 = new char[ch.length];
	String[] s1 = new String[s.length];
	Boolean[] b1 = new Boolean[b.length];

	@Test
	public void usingWhileLoop_integers() {
		System.out.println("===========Read Data from integer array==========");
		int index1 = 0;
		while (a.length > index1) {
			System.out.println(a[index1]);

			a1[index1] = a[index1] + 1;
			index1++;

		}

		System.out.println("===========Read inserted Data from integer array==========");
		int index2 = 0;
		while (a1.length > index2) {
			System.out.println(a1[index2]);
			index2++;

		}
	}

	@Test
	public void usingWhileLoop_character() {

		System.out.println("===========Read Data from character array==========");
		int index1 = 0;
		while (ch.length > index1) {
			System.out.println(ch[index1]);

			ch1[index1] = (char) (ch[index1] + 1);
			index1++;

		}

		System.out.println("===========Read inserted Data from character array==========");

		int index2 = 0;
		while (ch1.length > index2) {
			System.out.println((char) ch1[index2]);
			index2++;

		}

	}

	@Test
	public void usingWhileLoop_String() {

		System.out.println("===========Read Data from String array==========");
		int index1 = 0;
		while (s.length > index1) {
			System.out.println(s[index1]);

			s1[index1] = s[index1] + "__added";
			index1++;

		}

		System.out.println("===========Read inserted Data from String array==========");

		int index2 = 0;
		while (s1.length > index2) {
			System.out.println(s1[index2]);
			index2++;

		}

	}

	@Test
	public void usingWhileLoop_Boolean() {

		System.out.println("===========Read Data from Boolean array==========");
		int index1 = 0;
		while (b.length > index1) {
			System.out.println(b[index1]);

			b1[index1] = b[index1].FALSE;
			index1++;

		}

		System.out.println("===========Read inserted Data from Boolean array==========");

		int index2 = 0;
		while (b1.length > index2) {
			System.out.println(b1[index2]);
			index2++;

		}

	}

//	@Test
//	public void usingForLoop() {
//
//		for (int i = 0; i < a.length; i++) {
//
//			System.out.println(a[i]);
//		}
//
//	}
//
//	@Test
//	public void usingForEachLoop() {
//
//		for (int number : a) {
//
//			System.out.println(number);
//		}
//
//	}
//
//	@Test
//	public void usingWhileLoop() {
//
//		int i = 0;
//
//		while (a.length > i) {
//
//			System.out.println(a[i]);
//			i++;
//		}
//	}
//
//	@Test
//	public void usingDoWhileLoop() {
//		int i = 0;
//		do {
//
//			System.out.println(a[i]);
//			i++;
//
//		} while (a.length > i);
//
//	}
//
//	/* ===========================Insert integer elements into ARRAY================= */
//	@Test
//	public void insertUsingforLoop() {
//		
//		int[] a1 = new int[a.length];
//
//
//		for (int i = 0; i < a.length; i++) {
//			int j =a[i]; //reading from existing array
//			a1[i] = j; //insert into a1
//			
//		}
//
//		for (int i = 0; i < a1.length; i++) {
//
//			System.out.println(a1[i]); //printing new array elements
//		}
//
//	}
//
//	/*
//	 * @Test public void insertUsingforEachLoop() { int[] a1 = new int[5]; int i =
//	 * 0; // int num = 10; for (int num2 : a1) { a1[i] = num2; i++; // num2 = num2 +
//	 * 10; }
//	 * 
//	 * for (int a2 : a1) {
//	 * 
//	 * System.out.println(a2); }
//	 * 
//	 * }
//	 */
//	@Test
//	public void insertUsingforEachLoop2() {
//
//		int[] a1 = new int[5];
//		int i = 0;
//		
//		for (int num : a1) {
//			a1[i] = num;
//			i++;
//		}
//
//		for (int a2 : a1) {
//
//			System.out.println(a2);
//		}
//
//	}
//
//	@Test
//	public void insertUsingWhileLoop() {
//		int[] a1 = new int[5];
//		int i = 0;
//		int num = 10;
//		while (a1.length > i) {
//			a1[i] = num;
//			i++;
//			num = num + 10;
//		}
//		
//		int j=0;
//		while (a1.length>j) {
//			System.out.println(a1[j]);
//			j++;
//
//		}
//	}
//	
//	@Test
//	public void insertUsingDoWhileLoop() {
//		int[] a1 = new int[5];
//		int i = 0;
//		int num = 10;
//		do {
//			a1[i]=num;
//			num=num+10;
//			
//			//System.out.println(a1[i]);
//			i++;
//		} while (a1.length>i);
//		
//		int j=0;
//		do {
//			System.out.println(a1[j]);
//			j++;
//		} while (a1.length>j);
//		
//	}
//	

}
