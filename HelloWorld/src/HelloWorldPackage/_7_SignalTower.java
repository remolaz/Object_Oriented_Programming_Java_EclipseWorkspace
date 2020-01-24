package HelloWorldPackage;

import acm.program.ConsoleProgram;

public class _7_SignalTower extends ConsoleProgram {
	
	private String towerName; 
	private _7_SignalTower nextTower;

	public _7_SignalTower (String name, _7_SignalTower link) {
		towerName = name;
		nextTower = link;
	}
	
	public void signal() {
		lightCurrentTower();
		if(nextTower != null) nextTower.signal();
	}
	
	public void lightCurrentTower() {
		System.out.println("Lighting " + towerName);
		println("Lighting " + towerName); // DOESNT WORK AND I DON'T KNOW WHY
	}
	
}
