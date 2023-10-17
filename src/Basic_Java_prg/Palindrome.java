package Basic_Java_prg;

public class Palindrome {

	public static void main(String[] args) {
		int n=222,m=0,temp;
		temp=n;
		String count="";
		while(n>0)
		{
		m=(n%10);
		n=n/10;
		
		count=count+m;

		}
		if((Integer.parseInt(count))==temp)
			
			System.out.println(temp + " The given number is Palindrome");
	
		else
			System.out.println(temp + " The given number is not Palindrome");
		
		
		

	}

}
