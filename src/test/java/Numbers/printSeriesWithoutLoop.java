package Numbers;

public class printSeriesWithoutLoop {

	public static void m1(int i) {

		if (i <= 100) {
			System.out.println(i);
			i++;
			m1(i);
		}

	}

	public static void main(String[] args) {
		printSeriesWithoutLoop.m1(0);
	}

}
