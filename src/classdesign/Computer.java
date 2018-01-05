package classdesign;

public class Computer {
	
	// Instance Data
	private String make; // qualifying this as private stops it from screwing with classes in other apps. "Make" is private to this class
	private String model;
	private double price;
	
	// Constructor
	public Computer(String make, String model, double price) {
		this.make = make;
		this.model = model;
		this.price = price;
	}
	// Accessor ("Getter") method
	public String getMake () {     /// standard naming convention is to use "get" in front. 
		return make;
	}
	
	public String getModel() {
		return model;
	}
	
	public double getPrice() {
		return price;
	}
	
	//Setter (offers change)
	public void setPrice (double price) {  //??? Why are we using "void" here???? 
		this.price = price; 
	}
	
	//Method of behavior 
	public String download(boolean isDownloading) {
		if(isDownloading) {
			return this.make + " is downloading...";
			
		}else {
			return this.make + " is available for download.";
		}
		
	}
	
	@Override // This overrides the default toString method ---> IGNORE FOR THE PROJECT
	public String toString () {
		return "Make:\t" + make + " \nModel:\t" + model + "\nPrice:\t" + price;
		
		
		
	}
}

