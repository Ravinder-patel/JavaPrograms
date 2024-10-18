package Numbers;

public class PrimeNumbers {

	public static void main(String[] args) {
		PrimeNumbers pm = new PrimeNumbers();
		boolean flag = false;
		for (int i = 0; i < 20; i++) {
			flag = pm.primeNumber(i);
			if (flag) {
				System.out.println(i);
			}
		}
	}

	public boolean primeNumber(int num) {
		int x = num;
		int count = 0;
		for (int i = 1; i <= x; i++) {
			if (x % i == 0) {
				count++;
			}
		}
		if (count == 2) {
			return true;
		} else {
			return false;
		}

	}

}
