import java.util.Scanner;

public class RunningSumSecondStretch {

		public static void main(String[] args) {

			Scanner input = new Scanner(System.in);

			System.out.println("Enter an low integer");
			int low = input.nextInt();
			System.out.println("Enter an high integer");
			int high = input.nextInt();

			int sum = 0;
			while (high <= low) {
				System.out.println("Invalid input! Try again");
				System.out.println("Enter a new high integer");
				high = input.nextInt();
			}

			while (low <= high) {
				sum = sum + low;
				low++;
			}
			System.out.println(sum);

		}

	}