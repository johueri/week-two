
public class ArraySlideTwelve {

	public static void main(String[] args) {
		// https://wecancodeit.github.io/java-slides/fundamentals/arrays/#/12
		// 
		String myName = "Sue";
		char[] letters = myName.toCharArray();

		System.out.println("The first letter of my name is " + letters[0]);
		System.out.println("The last letter of my name is " + letters [letters.length-1]);
		
		System.out.println(myName.indexOf('S')); // prints "0"
		System.out.println("foo".indexOf("o")); // prints "1". It won't print out two because it only prints first one; ceases operation once it gets to an "o". 
	}

}
