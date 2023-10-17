package Array;

public class FrequencyElement {

	public static void main(String[] args) {
		int n[]= {5,8,6,5,8,6,6,5,8,9,8,9,7,6,3,3,4,1};
		String y[]= new String[n.length];
		int count=0,county=0;
		int ind=0;
		char c2;
		int com = 0;
		
		for(int i:n)
		{
			for(int j:n)
			{
				if(i==j)count++;
			}
			
				
				for(int p=0;p<y.length;p++)
				{
					if(y[p]!=null)
					{
						c2=y[p].charAt(0);
						com=c2-'0';//converting to int
						//System.out.println(" char: " +com);
						if(com==i)county++;
					}
				}
				
				if(county<1) {
				y[ind]= i+ "|"+count; 
				ind++;
				}
			
			county=0;count=0;
		}
		
		for(String k:y)
		{
			if(k!=null)System.out.println(k);
		}
		
		
	}
}
