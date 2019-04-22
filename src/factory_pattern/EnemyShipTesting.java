package factory_pattern;
import java.util.Scanner;

public class EnemyShipTesting {

	public static void main(String[] args) {
		EnemyShipFactory shipFactory = new EnemyShipFactory();
		EnemyShip theEnemy = null;
		System.out.println("What type of ship? (U / R / B)" );
		
		Scanner userInput = new Scanner(System.in);
		String typeOfShip = "";
		
		if (userInput.hasNextLine()) {
			typeOfShip = userInput.nextLine();
			
			theEnemy = shipFactory.makeEnemyShip(typeOfShip);
		}
		
		if (theEnemy != null) doStuffEnemy(theEnemy);
		else System.out.println("Enter a U, R, or B next time");
		
		userInput.close();
	}
	
	public static void doStuffEnemy(EnemyShip anEnemyShip) {
		anEnemyShip.displayEnemyShip();
		anEnemyShip.followHeroShip();
		anEnemyShip.enemyShipShoots();
	}
}
