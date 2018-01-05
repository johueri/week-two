
public class EvenOrOdd {

	public static void main(String[] args) {
		// https://wecancodeit.github.io/java-slides/fundamentals/branching-statements/#/5

		System.out.println("Message for 42: " + chooseMessage(42)); // concatenated method??
		System.out.println("Message for 23: " + chooseMessage(23));
	}

	public static String chooseMessage(int input) {
		if (input % 2 == 0) {
			return "Even Steven!";
		}
		return "You're odd!";
	}

}
