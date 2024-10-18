package Numbers;

import org.testng.annotations.Test;

public class OddNumbers {

	@Test
	public void oddNumber() {
		for (int i = 20; i < 30; i++) {
			if (i % 2 == 1) {
				System.out.println(i);
			}

		}

	}

	

}
