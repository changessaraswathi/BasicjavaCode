package Basic_Java_prg;

import java.util.Scanner;

public class PrintASCIIValue {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		//Type one
		System.out.println("Please Enter the string ");
		String k =sc.next();
		char c = 0;
		int f=0;	
		for(int i=0;i<k.length();i++)
		{
			c=k.charAt(i);
			f= c;
			System.out.println(k.charAt(i) + " = " + f);
		
		}
		//Type 
		System.out.println("Please Enter a Char ");
		
		char k2 =sc.next().charAt(0);
		int h=k2;
		
		
		System.out.println(k2 + " = " + h);
		System.out.println("---");
		
		//Type 3
		
		for(int i=0;i<26;i++)
		{
			
			System.out.println((char)('A'+i) +" = "+('A'+i));
			System.out.println((char)('a'+i) +" = "+('a'+i));
		}
		

	}

}
