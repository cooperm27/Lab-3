import java.util.Scanner;

public class integerAssociation {

	public static void main(String[] args) {

		Scanner scnr = new Scanner(System.in);
		int userInput;
		String userName;
		String playAgain;
		
		System.out.println("Hello, what is your name?");
		userName = scnr.nextLine();
	
		
		do {	
			System.out.println("OK, " +userName + " please enter a number between 1 and 100");
		
			userInput = scnr.nextInt();
			
			if(userInput%2 == 0 && userInput <= 25) {
				System.out.println("Thanks " +userName + " you entered " + userInput + ", that number is even and less than 25.");
			}else if(userInput%2 == 0 && userInput <= 60) {
				System.out.println("Thanks " +userName + " that number is even.");
			}else if(userInput%2 == 0 && userInput <= 100) {
				System.out.println("Thanks " +userName + " you entered " + userInput + ", that number is even.");
			}else if(userInput%2 != 0 && userInput < 60) {
					System.out.println("Thanks " +userName + " you entered " + userInput + ", that number is odd");
			}else if(userInput%2 != 0 && userInput <= 100) {
					System.out.println("Thanks " +userName + ", that number is odd and over 60.");
			}else {
				System.out.println("Sorry " + userName + " you must enter a number between 1 and 100");
			}
			System.out.println();
			System.out.println("Would you like to continue (y/n)?");
			playAgain = scnr.next();
			} while (playAgain.equalsIgnoreCase("y"));

			System.out.println("Thank you for playing " + userName);
			scnr.close();
		}
	}
