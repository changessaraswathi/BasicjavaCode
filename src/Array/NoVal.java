package Array;

public class NoVal {

	public static void main(String[] args) {
		int n[]= {0,1,2,3,4,8,9,9};
		System.out.println("the number of elements present in array :"+ n.length);
		int count=0;
		
		int j[]= new int[5];
		j[0]=1;j[3]=12;j[4]=2;
		System.out.println(" Length of Array : " + j.length);
		
		for(int h:j)
		{
			
			if(h>0)count++;
		}
		if(count>0)
			System.out.println("the number of elements present in array :"+ count);
	}

}
