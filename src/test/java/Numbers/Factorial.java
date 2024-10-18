package Numbers;
//WAP to print the factorial of the given number

import java.util.Scanner;

import org.testng.annotations.Test;

public class Factorial {
	@Test
	public void factorialOfNumber() {
		System.out.println("Enter A  number");
		 int num=new Scanner(System.in).nextInt();
		 int fact =1;
		         for(int i=5;i>=1;i--){
		             fact=fact*i;
		             
		         }
		         System.out.println(fact);
	}
	

}
