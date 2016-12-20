
public class Driver {

	public static void main(String[] args) 
	{
		SavingsAccount saver1 = new SavingsAccount(2000);
		SavingsAccount saver2 = new SavingsAccount(3000);
		
		SavingsAccount.modifyInterestRate(.04);
		
		System.out.printf("Balance for saver1: $%.2f\n", saver1.calculateMonthlyInterest());
		System.out.printf("Balance for saver2: $%.2f\n", saver2.calculateMonthlyInterest());
		System.out.println();
		
		SavingsAccount.modifyInterestRate(.05);
		
		System.out.printf("Balance for saver1: $%.2f\n", saver1.calculateMonthlyInterest());
		System.out.printf("Balance for saver2: $%.2f\n", saver2.calculateMonthlyInterest());
	}//main
}//class
