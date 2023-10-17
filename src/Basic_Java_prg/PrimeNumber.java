package Basic_Java_prg;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		int n=0;
		System.out.println("Plz enter the number to cal prime num : ");
		Scanner sc = new Scanner(System.in);
		n=sc.nextInt();
		int val=0,count=0;
		
		if(n>1)
		{
		
			for(int i=2;i<=n;i++)
			{
				val=n%i;
				System.out.println( n + "% " + i + " = " + val);
				
				if(val==0)
					count++;
				
			}
			
			if(count>1)
				System.out.println(n + " is a not prime num");
			else
				System.out.println(n + " is a  prime num");
		}
		else
			
			System.out.println(n + " is a not prime num");
		}

	}


