package Array;

public class OddPlaceVal {

	public static void main(String[] args) {
		int n[]= {0,1,2,3,4,5,6,7,8,9,10};
		for(int i=0;i<n.length;i++)
		{
			//System.out.println(i + "  "+ i%2);
			if((i%2)==0)
				System.out.println(n[i]);
		}
	}

}
