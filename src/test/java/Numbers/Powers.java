package Numbers;

import java.util.Scanner;

import org.testng.annotations.Test;

public class Powers {
	//WAP to find x power n (x and n are user given values)
	@Test
	public void powerOfValue() {
		System.out.println("Enter the base value");
		int num=new Scanner(System.in).nextInt();
		System.out.println("Enter the power value");
		int power=new Scanner(System.in).nextInt();
		int res = 1;
		for(int i=0;i<power;i++) {
			res=res*num;
		}
		System.out.println("power of result is:  "+res);
	}

}
