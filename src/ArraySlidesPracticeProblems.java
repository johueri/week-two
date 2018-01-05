
public class ArraySlidesPracticeProblems {

	public static void main(String[] args) {
		// https://wecancodeit.github.io/java-slides/fundamentals/arrays/#/10
		// For each of the following, create an array, assign its values, then print out
		// those values:
		// The names of three people you know.
		// The GPAs on a 4.0 scale of five students.

		String[] friends = { "Ben", "James", "Logan" };
		double[] gpa = { 4.0, 3.5, 3.0 };

		for (int i = 0; i < friends.length; i++) {
			System.out.println(friends[i]);
		}
System.out.println(" ");
		for (int i = 0; i < gpa.length; i++) {
			System.out.println(gpa[i]);
		}

	}
}