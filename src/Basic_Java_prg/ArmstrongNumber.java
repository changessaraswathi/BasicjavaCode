package Basic_Java_prg;

public class ArmstrongNumber {

	public static void main(String[] args) {
		int n=222,temp=0,m,ArmstrongNum=0;
		
		temp=n;
		while(n>0)
		{
			m=n%10;			
			n=n/10;
			ArmstrongNum=ArmstrongNum+(m*m*m);
			System.out.println(ArmstrongNum);			
		}
	}

}
