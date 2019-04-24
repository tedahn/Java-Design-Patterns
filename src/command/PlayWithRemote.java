package command;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class PlayWithRemote {
	
	public static void main(String[] args) {
		ElectronicDevice newDevice = TVRemote.getDevice();
		LinkedList<DeviceButton> commands = new LinkedList<DeviceButton>();
		
		TurnTVOn onCommand = new TurnTVOn(newDevice);
		
		DeviceButton onPressed = new DeviceButton(onCommand);
		commands.add(onPressed);
		
		onPressed.press();
		
		// ---------------------------------------
		
		TurnTVOff offCommand = new TurnTVOff(newDevice);

		DeviceButton offPressed = new DeviceButton(offCommand);
		commands.add(offPressed);
		
		offPressed.press();

		// ---------------------------------------
		
		TurnTVUp volUpCommand = new TurnTVUp(newDevice);
		
		DeviceButton volUpPressed = new DeviceButton(volUpCommand);
		
		volUpPressed.press();
		commands.add(volUpPressed);
		volUpPressed.press();
		commands.add(volUpPressed);
		volUpPressed.press();
		commands.add(volUpPressed);
		

		// ---------------------------------------
		
		Television theTV = new Television();
		Radio theRadio = new Radio();
		List<ElectronicDevice> allDevices = new ArrayList<ElectronicDevice>();
		
		allDevices.add(theTV);
		allDevices.add(theRadio);
		
		TurnItAllOff turnOffDevices = new TurnItAllOff(allDevices);
		
		DeviceButton turnThemOff = new DeviceButton(turnOffDevices);
		commands.add(turnThemOff);
		turnThemOff.press();

		// ---------------------------------------
		turnThemOff.pressUndo();
		
		for (DeviceButton button : commands) {
			button.pressUndo();
		}
	}
}
