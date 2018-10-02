import java.util.Scanner;

public class CalculatingSales {

	public static void main(String[] args) {
		// July 17th class
		
		//create scanner
		Scanner input=new Scanner(System.in);
		int productNumber = 0;
		int quantitySold = 0;
		double productPrice = 0.0;
		double transactionCost = 0.0;
		double totalCost = 0.0;
		
		
		
		
		
		System.out.println("Please enter product number (enter -1 to stop)");
		
		
		while(productNumber<=-1)
		{
		productNumber=input.nextInt();
		
		System.out.println("Please enter the quantity sold");
		quantitySold=input.nextInt();
		
		switch (productNumber)
		{
		case 1:
			productPrice = 2.98;
			break;
		case 2:
			productPrice = 4.50;
			break;
		case 3:
			productPrice = 9.98;
			break;
		case 4:
			productPrice = 4.49;
			break;
		case 5:
			productPrice = 6.87;
			break;
			
			
			transactionCost = quantitySold * productPrice;
			
			totalCost += transactionCost;
			
		}
		

		}
		
		
		
		
		
		
		
		

	}

}
