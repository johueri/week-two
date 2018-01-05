import java.util.Scanner;

public class RunningSumStretchGoal {

	public RunningSumStretchGoal() {
		// https://wecancodeit.github.io/java-slides/fundamentals/loops-01/#/10, ATM question with first stretch tasks
				
		Scanner input = new Scanner(System.in);
				
				System.out.println("Enter a low integer");
				int low = input.nextInt();
				System.out.println("Enter a high number");
				int high = input.nextInt();
				
				int sum = 0;
				
				while (low <= high) {
					sum = low + high; 
					low++;
					
					}
				System.out.println(sum);
		}
		}