package Basic_Java_prg;

public class primeNumber2 {

	public static void main(String[] args) {
		int n=100,count,val=0;
		for(int j=2;j<=10;j++)
		{
			count=0;
			for(int i=2;i<=j;i++)
			{
				val=j%i;
				if(val==0)
					count++;
				
			}
			if(count>1) 
				System.out.println("");
			else
				System.out.println(j + " Is  a prime number .");
			
		}
		

	}

}
