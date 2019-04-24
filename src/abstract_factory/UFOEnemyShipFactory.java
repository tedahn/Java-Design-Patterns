package abstract_factory;

public class UFOEnemyShipFactory implements EnemyShipFactory{
	public ESWeapon addESGun() {
		return new ESUFOGun(); //Specific to regular UFO
	}
	
	public ESEngine addESEngine() {
		return new ESUFOEngine();
	}
	
}
