package Numbers;

import org.testng.annotations.Test;

public class SwapNumbers {
	//1. WAP to swap two numbers with the help of Third variable
	
	@Test
	public void swapNumbers() {
		int a=5;
		int b=10;
		System.out.println("a value before: "+a);
		System.out.println("b value before: "+b);
		int temp=b;
		b=a;
		a=temp;
		System.out.println("a value after swaping: "+a);
		System.out.println("b valueafter swaping: "+b);
	}
	
	//2. WAP to swap two numbers without using Third variable
	@Test
	public void swapNumbersWithoutThirdVar() {
		int a=5;
		int b=10;
		System.out.println("a value before: "+a);
		System.out.println("b value before: "+b);
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("a value after swaping: "+a);
		System.out.println("b valueafter swaping: "+b);
	}

}
