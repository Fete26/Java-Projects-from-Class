/*Clayton Fete
 * Main driver test app
 * 8-3-17
 */

import java.util.Scanner;
//// Main drive class for invoice test.
public class RectangleTest {

	public static void main(String[] args) {
	
	////create scanner for user input	
	Scanner input= new Scanner(System.in);
	
	//set variables
	double width=1;
	double length=1;
	double area=1;
	double perimeter = 1;
	int rectangle=1;
	
	//new instance of class
	Rectangle rec=new Rectangle(width, length);
	
	System.out.printf("Enter width of rectangle 1: or enter-1 to quit");
	while(input.hasNextDouble()) {
		width=input.nextDouble();
		if(width==-1) {
			break;
		}
	
		rec.setWidth(width);
		System.out.printf("Please enter the length %n ", length);
		length=input.nextDouble();
		rec.setLength(length);
		area=rec.area();
		System.out.printf("The area of rectangle 1 is %s%n", area);
		perimeter=rec.perimeter();
		System.out.printf("The perimeter of rectangle 1 is %s%n", perimeter);
		rectangle++;
		System.out.printf("Enter width of rectangle %d: or enter-1 to quit%n", rectangle);
	
	}
	
	
	
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
