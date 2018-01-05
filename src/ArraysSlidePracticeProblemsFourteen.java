import java.util.jar.Attributes.Name;


public class ArraysSlidePracticeProblemsFourteen {

	public static void main(String[] args) {
		// https://wecancodeit.github.io/java-slides/fundamentals/arrays/#/14
		//Create an array holding the names of four of your peers sitting next to you. Print the first letter of each of their names.
		////Change your code (or create more code) that asks you to enter each of their names via the console.

		String[] classmates = {"James", "Ben", "Logan", "Henry"};
		
		for (int i = 0; i < classmates.length; i++) {
			System.out.println(classmates[i].charAt(0));
		}
		
		
	}

}

//