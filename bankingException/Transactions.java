package bankingException;

public class Transactions implements Bank{
	private double balance;
	
	public void deposit(double amt) {
		if(amt<=0) {
			throw new InvalidAmountException(001, "Invalid amount");
		} else {
		balance = balance+amt;
		System.out.println("Amount deposited " + amt);
		System.out.println("Total balance(Deposit method)" +balance);
		}
	}
	
	public double withdraw(double withdrawAmt) {
		if(withdrawAmt > balance) {
			throw new InsufficientFundsException(002, "In sufficient funds");
		} else {
		double Remainbalance = balance-withdrawAmt;
		System.out.println("Please collect cash ");
		System.out.println("Remaining balace: " +Remainbalance);		
		return Remainbalance;
		}
	}

	
	public void checkBalance() {
		System.out.println("final balance "+balance);
		
	} 


}
