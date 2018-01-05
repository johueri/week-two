import java.util.Scanner;
public class ThursdayWarmUp {

	public static void main(String[] args) {
		// https://github.com/WeCanCodeIT/wcci-columbus-2017-fall/blob/master/WarmUps/week2.md
		
		Scanner input = new Scanner(System.in);
		String[] faveBands = new String[5]; //Why is this a 5 and not a 4. Maybe arrays start at 1 and not 0?
		
		System.out.println("What are your five favorite bands?");
		for (int i=0; i<faveBands.length; i++) {
		System.out.println("Band" + (i+1)+ ": ");
		faveBands[i] = input.nextLine();
		
		}
		System.out.println("Your bands in reverse order are: ");
		for (int i = faveBands.length-1; i>=0; i--) {
		System.out.println("Band " + (i+1) + " is: " + faveBands[i] );
		
		
		

	}

}
}