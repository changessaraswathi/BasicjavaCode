package Array;

public class AscOrder {

	public static void main(String[] args) {
		int i[]= {10,5,8,3};
		int j[]= new int[i.length];
		int ind=0;
		
		for(int k:i)
		{
			for(int n:i)
			{	if(ind==i.length) break;
				if(n<k)
					{
					
					if(ind==0)j[ind]=n;
						if(n<j[ind])
						{	j[ind]=n;
					System.out.println(j[ind]);
					
					ind++;
						}
					}
				
			}
			
		}

	}

}
