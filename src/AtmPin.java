import java.util.Scanner;

public class AtmPin {

	public static void main(String[] args) {
		// https://wecancodeit.github.io/java-slides/fundamentals/loops-01/#/10, ATM question without stretch tasks
		Scanner input = new Scanner(System.in);
		int pin = 1234;

		System.out.println("Enter a PIN");
		int pinEntered = input.nextInt();

		int count = 1;
		while (pinEntered != pin && count < 3) {
			System.out.println("Invalid pin!, try again");
			pinEntered = input.nextInt();
			count++;
		}
        input.close(); 
		if (pinEntered != pin) {
			System.out.println("Sorry too many attempts");
		} else {
			System.out.println("Congratulations!");
		}
	}
}