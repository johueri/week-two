
public class ArraySlidesPracticeProblemsTwo {

	public static void main(String[] args) {
		// https://wecancodeit.github.io/java-slides/fundamentals/arrays/#/10
		// Create an array of your top four vacation spots, then print the top (first)
		// spot and the bottom (last spot).
		// Create a String that holds your last name. Print out the number of letters in
		// your name.
String[] vacSpots = {"Ohio", "Maine", "Puerto Rico", "Capri"};
		

System.out.println(vacSpots[0] + " , " + vacSpots[vacSpots.length-1] ); // "vacSpots[vacSpots.length-1]" this weird code guarantees it'll chose the last vacation spot in the list

//search your vacation spots array and give feedback on if Al's favorite vacation spot in the world, Pittsburgh(?)
//is in our collection or not

 for(int i=0; i<vacSpots.length; i++) {
	 if(vacSpots[i].toLowerCase().contains("pittsburgh")) {
		 System.out.println("Go Steepers!");
	 }else {
		 System.out.println("Go Browns!");
	 }
 }
 
	}

}
