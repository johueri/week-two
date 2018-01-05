import java.util.Scanner;

public class PracticeProblemsLoopsOctTwo {

	public static void main(String[] args) {
		// https://wecancodeit.github.io/java-slides/fundamentals/loops-01/#/8
		// If I wanted to ask the user for a message, then display it five times, how would I do this?
		
		Scanner input = new Scanner(System.in);
		String userMessage;
		
		int count = 1;
		System.out.println("Please type any message and see it multiply: ");
		userMessage = input.nextLine();
		
		while (count < 6) {
			System.out.println(userMessage);
			count++; // remember, this increases the value of count by 1
		}
		
		System.out.println( "I have chosen a random number. Guess it! ");
		int number = input.nextInt();
		
		while (number != 7) {
			if (number!= 7) {
			System.out.println("Wrong Number. Please try again. Hint: It's viewed by some cultures as a lucky number.");
		}
			System.out.println( "I have chosen a random number. Guess it! ");
		    number = input.nextInt();
			
		    
		

	 
		
	}

}
}
