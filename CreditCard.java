import java.text.DecimalFormat;
public class CreditCard {

private double PurchasePrice=0;
private int term=6;
private double totalPrice=0;
private double monthlyPayment=0;


public CreditCard(double PurchasePrice, int term, double qualifiedAmt, double totalPrice) {
	this.PurchasePrice = PurchasePrice;
	this.term = term;
	this.totalPrice = totalPrice;
}

public CreditCard() {
	this.PurchasePrice = PurchasePrice;
	this.term = term;
	this.totalPrice = totalPrice;
}

public double getPurchasePrice() {
	return PurchasePrice;
}

public void calcPurchasePrice(double PurchasePrice) {
	this.PurchasePrice = PurchasePrice;
	this.calcTotalPrice();
	this.calcTerm();
	this.calcMonthlyPayment();
}

public int getTerm() {
	return term;
}

private void calcTerm() {
	
	if(this.totalPrice>=200 && this.totalPrice<500) {
		this.term=9;
	}
	else if(this.totalPrice>=500) {
		this.term=12;
	}
}

public double getTotalPrice() {
	return totalPrice;
}

private void calcTotalPrice() {
	this.totalPrice=this.totalPrice+PurchasePrice;

}

private void calcMonthlyPayment() {
	this.monthlyPayment = totalPrice/term;   
}
public double getMonthlyPayment() {
	return this.monthlyPayment;
}



public void printCreditCard() {
	double mp=Math.round(this.monthlyPayment*100.0)/100.0d;
	double tp=Math.round(this.totalPrice*100.0)/100.0d;
	DecimalFormat df = new DecimalFormat("##.##");
	
	
	System.out.printf("Your total amount Due is %s%n",df.format(tp));
	System.out.printf("Your term is %d Months%n", this.term);
	System.out.printf("Your Monthly Payment is %s%n%n",df.format(mp));
	
}





























}
