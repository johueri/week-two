import java.util.Scanner;

public class Porridge2 {

	public static void main(String[] args) {
		
		// https://wecancodeit.github.io/java-slides/fundamentals/loops-01/#/7 ---> This is just a "While Loop". They're more popular than "Do While" loops. 
		Scanner input = new Scanner(System.in);
		String porridgeTemperature;
		
		 System.out.println("Please specify porridge temperature.");
		 System.out.println("Type \"help\" to list options.");
		 porridgeTemperature = input.nextLine();
		 
		 while(porridgeTemperature.equals("help")) {
			 
			if(porridgeTemperature.equals("help")) {
			System.out.println("Options: too hot, too cold, just right");
			}
			 System.out.println("Please specify porridge temperature.");
			 System.out.println("Type \"help\" to list options.");
			 porridgeTemperature = input.nextLine();
		 }
	}
}
		
		 
		
		