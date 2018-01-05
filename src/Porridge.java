import java.util.Scanner;
public class Porridge {

	public static void main(String[] args) {
		
		// https://wecancodeit.github.io/java-slides/fundamentals/loops-01/#/7 ---> This is a "DO WHILE" loop
		Scanner input = new Scanner(System.in);
		String porridgeTemperature;
		do {
		  System.out.println("Please specify porridge temperature.");
		  System.out.println("Type \"help\" to list options.");
		  porridgeTemperature = input.nextLine();
		  
		  if(porridgeTemperature.equals("help")) {
		    System.out.println("Options: too hot, too cold, just right");
		  }
		} while(porridgeTemperature.equals("help"));
		input.close();
		
		System.out.println("Program continues...");

	}

}
