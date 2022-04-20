
public class CheckingAccount extends BankAccount{
	
	private double FEE = 0.15;

	
	public CheckingAccount (String name, double initial){
		super(name, initial);
		
	}

	public boolean withdraw(double amount)
	{
		amount +=FEE;
		return super.withdraw(amount);
	
	}

}
