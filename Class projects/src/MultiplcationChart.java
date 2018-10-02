/*Clayton Fete
 * July 25th 2017
 * Week 5 Assignment
 */
import java.util.Scanner;
import java.security.SecureRandom;


public class MultiplcationChart {

	public static void main(String[] args) {
		
		//adding my scanner and secure random
		Scanner input = new Scanner(System.in);
		SecureRandom randomNumbers = new SecureRandom();
		
		//setting my variables
		int answer=0;
		int x = 1 + randomNumbers.nextInt(20);
		int y = 2 + randomNumbers.nextInt(12);
		int correctAnswer=0;
		correctAnswer=generateQuestion(x, y);
		
		
		//creating my loop for the questions that are required in the assignment
		do {
			System.out.printf("Please answer the following question. %nHow much is %d times %d%n", x, y);
			answer=input.nextInt();
			
			if (answer==correctAnswer) {
			System.out.println("Very good!");
			 x = 1 + randomNumbers.nextInt(20);
			 y = 2 + randomNumbers.nextInt(12);
			 correctAnswer=generateQuestion(x, y);
			 
			
		}
			else {
				System.out.println("No. Please try again.");
				
			}
			
			
		} while(input.hasNextLine());
			
		}
		//creating my method called generateQuestion
		public static int generateQuestion(int x, int y){
			
			
			int correctAnswer=0;
			correctAnswer=x*y;
			return correctAnswer;
			
		}
		
	
				

          
		
	}
	
	
		

