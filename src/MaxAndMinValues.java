import java.util.Scanner;

public class MaxAndMinValues {

	public static void main(String[] args) {
		// https://github.com/WeCanCodeIT/wcci-columbus-2017-fall/blob/master/week2/for-loop-practice.md
		// Ask the user for 5 integers. Create a for loop structure that finds the max and min from the data entered.

		Scanner input = new Scanner(System.in);
		
		int min = Integer.MAX_VALUE; //????? Why? but you do know this is a "class" because its in all caps. The "MAX_VALUE" is in caps because the value is constant.; 
		int max = Integer.MIN_VALUE;
		
		for (int i=1; i<=5; i++) {
			System.out.println("Enter an integer");
			int number = input.nextInt();
			if (number < min) {
				min = number;
			}
			if (number > max) {
				max = number;
			}
		}
		
		System.out.println("The min number is " + min);
		System.out.println("The max number is " + max);
	}

}
