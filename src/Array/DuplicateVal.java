package Array;

public class DuplicateVal {

	public static void main(String[] args) {
		int i[]= {9,8,7,8,9,9,9,9,9,9,5,5,5,2,2};
		int count=0,ind=0,c2=0;
		int y[]= new int[i.length];
		
		
		
		
		for(int j=0;j<i.length;j++)
		{count=0;
			
			for(int k=0;k<i.length;k++)
			{
				if(i[j]==i[k])count++;
				
				
			}
			
			System.out.println("step 1");
				if(count>1) {
				
					if(ind == 0)
					{
						System.out.println("step 2");
					y[ind]=i[j];
					ind++;
					}
					else
					{c2=0;
					
						for(int p=0;p<y.length;p++)
						{
							if(i[j]==y[p])c2++;
						}
						if(c2<1)
						{
							
							y[ind]=i[j];
							ind++;
						}
					}
				}
			
			
		}
		
		for(int u: y)
		{	if(u!=0)
			System.out.println(u);
		}
		
		
		
	}

}
