package HoagieHut;

public abstract class Hoagie {
	
	boolean afterFirstCondiment = false;
	
	final void makeSandwich() {
		cutBun();
		
		if(customerWantsMeat()) {
			addMeat();
			afterFirstCondiment = true;
		}
		
		if(customerWantsCheese()) {
			if(afterFirstCondiment) { System.out.print("\n");}
			addCheese();
			afterFirstCondiment = true;
		}
		
		if(customerWantsVegetables()) {
			if(afterFirstCondiment) { System.out.print("\n");}
			addVegetables();
			afterFirstCondiment = true;
		}
		
		if(customerWantsCondiments()) {
			if(afterFirstCondiment) { System.out.print("\n");}
			addCondiments();
			afterFirstCondiment = true;
		}

		if(afterFirstCondiment) { System.out.print("\n");}
		wrapTheHoagie();
		
		serveTheHoagie();
	
	}
	
	public void cutBun() {
		System.out.println("The Hoagie is cut");
	}
	
	abstract void addMeat();
	abstract void addCheese();
	abstract void addVegetables();
	abstract void addCondiments();
	
	boolean customerWantsMeat(){ return true; }
	boolean customerWantsCheese(){ return true; }
	boolean customerWantsVegetables(){ return true; }
	boolean customerWantsCondiments(){ return true; }

	public void wrapTheHoagie() {
		System.out.println("Wrap the Hoagie");
	}
	
	public void serveTheHoagie() {
		System.out.println("Your Hoagie is Complete!\n");
	}
}
