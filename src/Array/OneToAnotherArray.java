package Array;

public class OneToAnotherArray {

	public static void main(String[] args) {
		int i[]= new int[5];
		int j[]= new int[i.length];
		j=i;
		
		for(int k=0;k<i.length;k++)
		{   i[k]=k+25;
			j[k]=i[k];
		System.out.println(j[k]);
		}

	}

}
