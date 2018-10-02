import java.util.Scanner;
/*Clayton Fete
 * July 19th 2017
 * Week 4 Assignment
 */

public class GasMileage {

	public static void main(String[] args) {
//setting up my variables
	Scanner input = new Scanner(System.in);
	int milesDriven=0;
	int gallons=0;
	double mpg;
	int trips=1;
	int totalMiles=0;
	int totalgallons=0;
	double totalmpg=0;
	
	System.out.println("Enter voyage 1 mileage: or enter-1 to quit");
	

	while(input.hasNextInt()) {
	
		//making sure user has a way to end the program
		milesDriven=input.nextInt();
		if(milesDriven==-1) {
			break;
		}
		System.out.println("Please enter gallons used");
		gallons=input.nextInt();
		mpg=milesDriven/gallons;
		System.out.printf("Current MPG= %f%n",mpg);
		totalMiles=totalMiles+milesDriven;
		totalgallons=totalgallons+gallons;
		totalmpg=totalMiles/totalgallons;
		System.out.printf("Total MPG= %f%n ",totalmpg);
		trips++;
		System.out.printf("Enter voyage %d mileage: or enter -1 to quit%n",trips);
	}
	
	
	
	
	
	
	
	}	

}
