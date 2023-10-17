package Basic_Java_prg;

import java.util.Scanner;

public class PrintPatterns {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the pattern type: ");
		String s=sc.next();
		System.out.println("How many type the pattern has to be repeted ");
		int n=sc.nextInt();
		
		for(int j=1; j<=n;j++)
		{
			for(int i=1;i<=j;i++)
			{
				
				
				System.out.print(s+" " );
				
			}
			System.out.println("");
		}
		for(int j=n-1; j>0;j--)
		{
			for(int i=j;i>0;i--)
			{
				
				System.out.print(s+" ");
				
			}
			System.out.println("");
		}
		
		
		
		
		
		
		

		
		

	}

}
