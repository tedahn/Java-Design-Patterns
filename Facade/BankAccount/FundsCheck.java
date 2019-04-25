package BankAccount;

public class FundsCheck {

	private double cashInAccount = 1000.00;
	
	public double getCashInAccount() { return cashInAccount;}
	
	public void decreaseCashInAccount( double cashWithdrawn) {
		cashInAccount -= cashWithdrawn;
	}

	public void increaseCashInAccount( double cashDeposited) {
		cashInAccount += cashDeposited;
	}
	
	public boolean haveEnoughMoney ( double cashToWithdrawl ) {
		if (cashToWithdrawl > getCashInAccount()) {
			System.out.println("Error: You don't have enough money");
			System.out.println("Current Balance : " + getCashInAccount());
			return false;
		} else {
			
			decreaseCashInAccount(cashToWithdrawl);
			System.out.println("Withdrawal Complete: Current Balance is " + getCashInAccount());
			return true;
		}
	}
	
	public void makeDespoite(double cashToDeposit) {
		increaseCashInAccount(cashToDeposit);
		System.out.println("Deposit Complete: Current Balance is " + getCashInAccount());
	}
}
