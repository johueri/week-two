import java.util.Scanner;

public class PracticeProblemsDayTwo {

	public static void main(String[] args) {
		// https://github.com/WeCanCodeIT/wcci-columbus-2017-fall/blob/master/week2/for-loop-practice.md
		// Question: Count it up (did't we already do this??)
		
		Scanner input = new Scanner(System.in);
	
		System.out.println("Enter a number");
		int number = input.nextInt();
				
				
		for (int i = 0; i <= number; i++) {
			System.out.print(i + " ");
		}
	System.out.println("\nI just counted to " + number);
	
		
		

	}

}
