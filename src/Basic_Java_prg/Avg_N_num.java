package Basic_Java_prg;

import java.util.Scanner;

public class Avg_N_num {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int noTime = 0,val=0,temp=0;
		System.out.println("HOW MANY NUMBER YOU WANT TO AVG :");
		noTime=sc.nextInt();
		for(int i=1;i<=noTime;i++)
		{
			 System.out.println("Enter the " + i + "  Number :");
			 val=sc.nextInt();
			 temp=(temp+val);
			
		}
		
		temp=temp/noTime;
		System.out.println("Avg of given Number is  : " + temp);
		
	}

}
