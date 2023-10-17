package Basic_Java_prg;

import java.util.Scanner;

public class DiscountOfProduct {

	public static void main(String[] args) {
		String PName;
		double Pvalue,PDis,calVal;
		
		// get product name,price ,discount 
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Please enter the Product Name:");
		PName= sc.next();
		System.out.println("Please enter the Product Price:");
		Pvalue = sc.nextFloat();
		System.out.println("Please enter the Product Discount:" );
        PDis = sc.nextInt();
        
        //CAL DISCOUNT
        
		PDis=(PDis/100);
		PDis = Pvalue * PDis;	
		calVal=Pvalue -PDis;
		//display the final price
		
		System.out.println("The Product value After Discount is  "+ calVal);
	

	}

}
