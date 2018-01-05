import java.util.Scanner;

public class RunningSum {
	public static void main(String[] args) {
		// https://wecancodeit.github.io/java-slides/fundamentals/loops-01/#/10, ATM question without stretch tasks
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter an integer");
		int number = input.nextInt();
		
		int count = 1;
		int sum = 0;
		
		while (count <= number) {
			sum += count; // = sum + count
			count++;
			
			}
		System.out.println(sum);
}
}