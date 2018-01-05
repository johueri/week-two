import java.util.Scanner;

public class ArrayDemoWithUserInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

				Scanner input = new Scanner(System.in);
				int[] cupValues = new int[5];

				for (int i = 0; i < cupValues.length; i++) {
					System.out.println("Enter an integer");
					cupValues[i]= input.nextInt();
				}

				// use a for loop to display all items in the array
				for (int i = 0; i < cupValues.length; i++) {
					System.out.println(cupValues[i]);
				}
				input.close();
			}
	}


