
public class MultiplesOfThree {

	public static void main(String[] args) {
		// https://wecancodeit.github.io/java-slides/fundamentals/branching-statements/#/4
		//Change from ".continue" to if/else statement

		for(int count = 1; count <= 10; count++) {
			  if(count % 3 != 0) { // it's a multiple of three
				  System.out.println("Count is " + count);
			  }
			  
			}
	}

}
