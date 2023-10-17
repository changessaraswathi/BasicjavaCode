package Basic_Java_prg;

import java.util.Scanner;

public class Fibonacci_Series {
	//0,1,1,2,3,5,8,13

	public static void main(String[] args) {
		int n;
		int num1=0,num2=1,currNum=0;
		String Fib="0,1";
		System.out.println("Enter the number to cal the fibonacci serious :");
		Scanner sc = new Scanner(System.in);
		n=sc.nextInt();
		
		// cal fibo
		for(int k=2;k<n;k++)// loop start from 2
		{
			currNum=num1+num2;
			num1=num2;
			num2=currNum;
			Fib=Fib + "," + currNum;
		}
		System.out.println(Fib);
	}
}
