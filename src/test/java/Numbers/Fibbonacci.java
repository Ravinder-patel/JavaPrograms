package Numbers;

import org.testng.annotations.Test;

public class Fibbonacci {
	@Test
	public void fibbonacci() {
	int a=0;
	int b=1;
	int c=0;
	
	for (int i = 0; i < 10; i++) {
		System.out.print(a+" ");
		c=a+b;
		a=b;
		b=c;
		
		
		
		
	}
	}
	
	

}
