
public class Printing {

	public static void main(String[] args) {

		 import java.security.SecureRandom;
		 import java.util.Scanner;

		 

		 private static int answer;
		 private static int guess;
		 private static int checkReponse;

		     public static void main(String[] args) {

		         int answer;

		     }

		     public void Quiz(){
		         Scanner input = new Scanner(System.in);
		         int guess;
		     }

		     public void createQuestion(){

		         SecureRandom randomNumbers = new SecureRandom();
		         int number1 = randomNumbers.nextInt();
		         int number2 = randomNumbers.nextInt();

		         answer = number1 * number2;

		         System.out.printf("How much is %d times %d\n", number1, number2);
		     }

		     public void checkResponse(){

		         if (guess != answer)

		             System.out.println("No. Please try again.");

		         else{

		             System.out.println("Very Good!");
		                     createQuestion(); 
		         }

		     }

		 }