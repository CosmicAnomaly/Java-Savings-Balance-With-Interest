
public class SavingsAccount 
{
	public static double annualInterestRate;
	private double savingsBalance;

	public SavingsAccount(double savingsBalance) {
		super();
		this.savingsBalance = savingsBalance;
	}

	public double calculateMonthlyInterest()
	{
		return savingsBalance += (savingsBalance * annualInterestRate / 12);
	}//calculateMonthlyInterest
	
	public static double modifyInterestRate(double interestRate)
	{
		return annualInterestRate = interestRate;
	}//modifyInterestRate

	public double getSavingsBalance() {
		return savingsBalance;
	}
}//class
