package atmmachine;

public class Atm {
// https://github.com/WeCanCodeIT/wcci-columbus-2017-fall/blob/master/week2/atm-machine.md
	
//Instance Data
	private String requiredPin;
	private double balance;
// Constructor 
	public Atm(String requiredPin, double balance) {
		this.requiredPin = requiredPin;
		this.balance = balance;
	}
// Method of Behavior 
	public boolean allowAccess(String enteredPin) {
		return requiredPin.equals(enteredPin);
		}
	
	public void makeDeposit(double amount){
		balance += amount;
	}
	
	public void makeWithdraw(double amount) {
		balance -=amount;
	}
	
	public double getBalance() {
		return balance;
	}
	}