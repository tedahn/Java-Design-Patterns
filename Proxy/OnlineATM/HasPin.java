package OnlineATM;

public class HasPin implements ATMState{
	ATMMachine atmMachine;
	
	public HasPin(ATMMachine newATMMachine) {
		atmMachine = newATMMachine;
	}

	@Override
	public void insertCard() {
		System.out.println("You can't enter more than one card");
	}

	@Override
	public void ejectCard() {
		System.out.println("Card Ejected");
		atmMachine.setATMState(atmMachine.getNoCardState());
	}

	@Override
	public void insertPin(int pinEntered) {
		System.out.println("Already Entered PIN");
	}

	@Override
	public void requestCash(int cash) {
		if (cash > atmMachine.cashInMachine) {
			System.out.println("Don't Have that Cash");
			ejectCard();
		} else {
			System.out.println(cash+ " is provided by the machine");
			atmMachine.setCashInMachine(atmMachine.cashInMachine - cash);
			ejectCard();
			
			if(atmMachine.cashInMachine <= 0) {
				atmMachine.setATMState(atmMachine.getNoCashState());
			}
		}
	}

}
