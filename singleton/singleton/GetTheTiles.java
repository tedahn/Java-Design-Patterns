package singleton;

import java.util.LinkedList;

public class GetTheTiles implements Runnable{
	public void run() {
		Singleton newInstance = Singleton.getInstance();
		LinkedList<String> playerOneTiles = newInstance.getTiles(7);
		System.out.println("Instance ID: " + System.identityHashCode(newInstance));
		System.out.println(newInstance.getLetterList());
		System.out.println("Player: " + playerOneTiles);
		System.out.println("Got Tiles");
	}
}
