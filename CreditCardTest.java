import java.util.Scanner;
public class CreditCardTest {

	
	public static void main(String[] args) {
		double PurchasePrice=0;
		int term=0;
		double qualifiedAmt=0;
		double totalPrice=0;
		CreditCard cc=new CreditCard();
		Scanner input = new Scanner(System.in);
		
		
		
		System.out.println("Please enter first purchase or enter -1 to quit");
		while(input.hasNextDouble()) {
			PurchasePrice = input.nextDouble();
			if(PurchasePrice==-1) {
				break;
			}
			cc.calcPurchasePrice(PurchasePrice);
			cc.printCreditCard();
			System.out.println("Please enter next purchase or enter -1 to quit");
			
		}
		
		
		
		

	}

}
