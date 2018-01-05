
public class ArrayDemo {

	public static void main(String[] args) {
		//https://wecancodeit.github.io/java-slides/fundamentals/arrays/#/2
		
		int[] cupValues = new int[5];
		
		cupValues [0] = 42;
		cupValues [1] = 86;
		cupValues [2] = 23;
		cupValues [3] = 8;
		cupValues [4] = 91;
		
		//use a for loop to display all items in the array
		
		for(int i=0; i < cupValues.length; i++) {
			System.out.println(cupValues[i]);
		}
		
	}

}
