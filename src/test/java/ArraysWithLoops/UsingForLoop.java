package ArraysWithLoops;

import org.testng.annotations.Test;

/*2.	WAP to print the elements present in an Array using for loop
*/
public class UsingForLoop {
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
	public void usingForLoop() {

		System.out.println("===========Read Data from array==========");
		for (int i = 0; i < 5; i++) {

			System.out.println(a[i] + "\t" + ch[i] + "\t" + s[i] + "\t" + b[i]);

			// insert into new array
			a1[i] = a[i];
			ch1[i] = ch[i];
			s1[i] = s[i];
			b1[i] = b[i];
		}

		System.out.println("===========read Inserted Data==========");

		for (int i = 0; i < 5; i++) {
			System.out.println(a1[i] + "\t" + ch1[i] + "\t" + s1[i] + "\t" + b1[i]);
		}
	}

}
