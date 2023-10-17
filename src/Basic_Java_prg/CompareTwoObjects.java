package Basic_Java_prg;

public class CompareTwoObjects {
	
	int c=0;
	public CompareTwoObjects(int a,int b)
	{
		this.c=add(a,b);
	}

	public static void main(String[] args) {
		CompareTwoObjects obj1= new CompareTwoObjects(10,20);
		
		CompareTwoObjects obj2= new CompareTwoObjects(10,20);
		
		System.out.println(obj1.equals(obj2));
	
		
		
		
		
	}
	
	public static int add(int a,int b)
	{
		return a+b;
	}

}
