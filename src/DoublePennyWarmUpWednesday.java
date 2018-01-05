import java.text.NumberFormat;
import java.util.Locale;

public class DoublePennyWarmUpWednesday {

	// https://github.com/WeCanCodeIT/wcci-columbus-2017-fall/blob/master/WarmUps/week2.md
	// Create a program with a for loop that doubles a pennny every day for 30 days
	// Once complete, convert your answer from pennies to dollars and display the total after 30 days.
	
	public static void main(String[] args) {
		double pennyTotal = 0.01;
		NumberFormat currency = NumberFormat.getCurrencyInstance(Locale.US);
	for (int i = 0; i<=30; i++) {
		pennyTotal *= 2; 
		System.out.println("On day " + (i+1) + ("we have: ") + currency.format(pennyTotal));
	}
System.out.println(pennyTotal);
}
}