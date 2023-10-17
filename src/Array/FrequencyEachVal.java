package Array;

public class FrequencyEachVal {

	public static void main(String[] args) {
		int i[]= {9,8,7,8,9,9,9,9,9,9,5,5,5,2,2};
		int count=0,ind=0,c2=0;
		int y[]=new int[i.length];
		
		
		
		for(int j=0;j<i.length;j++)
		{count=0;
			
			for(int k=0;k<i.length;k++)
			{
				if(i[j]==i[k])count++;
				//System.out.println(count);
				
			}
			//System.out.println(i[j]);	
			if(count>1) {
				if(ind==0) {
				y[ind]=i[j];
				ind++;
				}else
				{
					for(int k =0;k<y.length;k++)
					{
						if(y[k]==i[j])c2++;
					}
					if(c2<1)
					{
						y[ind]=i[j];
						
						ind++;
						
					}
				}
			}
				
			
		}
		
		
		for(int e=0;e<y.length;e++)
			System.out.println(y[e]);
	}

}
