package ArraysWithLoops;

import org.testng.annotations.Test;

/*3.	WAP to print the elements present in an Array using for each loop
*/public class UsingForEachLoop {

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
	public void usingForEachLoop() {

		System.out.println("===========Read Data from integer array==========");
		int index = 0;
		for (int x : a) {

			System.out.println(x); // read array

			a1[index++] = x + 1;

		}
		System.out.println("===========read Inserted integer Data==========");
		for (int a11 : a1) {

			System.out.println(a11); // read array

		}

		System.out.println("===========Read Data from character array==========");
		int index2 = 0;
		for (int x : ch) {

			System.out.println((char) x); // read array

			ch1[index2++] = (char) (x + 1);

		}
		System.out.println("===========read Inserted character Data==========");
		for (int ch11 : ch1) {

			System.out.println((char) ch11); // read array

		}

		System.out.println("===========Read Data from string array==========");
		int index3 = 0;
		for (String x : s) {

			System.out.println(x); // read array

			s1[index3++] = x + "_added";

		}
		System.out.println("===========read Inserted string Data==========");
		for (String s11 : s1) {

			System.out.println(s11); // read array

		}

		System.out.println("===========Read Data from boolean array==========");
		int index4 = 0;
		for (Boolean x : b) {

			System.out.println(x); // read array

			b1[index4++] = x.FALSE; // if its true make it false

		}
		System.out.println("===========read Inserted boolean Data==========");
		for (Boolean b11 : b1) {

			System.out.println(b11); // read array

		}

	}


}

//String[] s = { "Hyd", "Bang", "kolkata", "delhi", "mumbai" };
//
//@Test
//public void usingForLoop() {
//
//	for (int i = 0; i < s.length; i++) {
//		System.out.println(s[i]);
//	}
//
//}
//
//@Test
//public void usingForEachLoop() {
//
//	for (String s2 : s) {
//		System.out.println(s2);
//	}
//
//}
//
//@Test
//public void usingWhileLoop() {
//	int i = 0;
//	while (s.length > i) {
//
//		System.out.println(s[i]);
//		i++;
//	}
//}
//@Test
//public void usingDoWhileLoop() {
//	int i = 0;
//	do {
//		System.out.println(s[i]);
//		i++;
//	} while (s.length>i);
//}
//
///* ===========================Insert String elements into ARRAY================= */
//@Test
//public void insertUsingforLoop() {
//	
//	String [] a1=new  String[5];
//	Scanner scan=new Scanner(System.in);
//	
//	for (int i = 0; i < a1.length; i++) {
//		System.out.println("Enter city names : ");
//		a1[i]=scan.nextLine();	
//	}
//	for(int i=0;i<a1.length;i++) {
//		System.out.println(a1[i]);
//	}
//}
