import java.util.Scanner;

public class NameBackwardsPracticeProblem {

	public static void main(String[] args) {
		//
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a name:");
		String name = input.nextLine();
		
		for (int i = name.length()-1; i >= 0; i--) {
			System.out.println(name.charAt(i));
		}
	}

}
