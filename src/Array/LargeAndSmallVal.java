package Array;

public class LargeAndSmallVal {

	public static void main(String[] args) {
		int n[]= {5,10,19,20,25,75,50,2,1,-5};
		int large=0,small=n[0];
		
		for(int i:n)
		{
			if(i>large && i>small)large=i;
			
			if(i<small)small=i;
			
		}
		System.out.println("Lager: " + large + " Small : "+ small);
}

}