package HelloWorldPackage;

import acm.program.ConsoleProgram;

public class _7_UseSignalTower extends ConsoleProgram {
	
	public void run() {
		
		createSignalTowers();
		
	}
	
	private void createSignalTowers() {
		
		_7_SignalTower rohan = new _7_SignalTower("Rohan", null);
		_7_SignalTower halifirien = new _7_SignalTower("Halifirien", rohan);
		_7_SignalTower calenhad = new _7_SignalTower("Calenhad", halifirien);
		_7_SignalTower minRimmon = new _7_SignalTower("Min-Rimmon", calenhad);
		_7_SignalTower erelas = new _7_SignalTower("Erelas", minRimmon);
		_7_SignalTower nardol = new _7_SignalTower("Nardol", erelas);
		_7_SignalTower eilenach = new _7_SignalTower("Eilenach", nardol);
		_7_SignalTower amonDin = new _7_SignalTower("Amon Din", eilenach);
		_7_SignalTower minasTirith = new _7_SignalTower("Minas Tirith", amonDin);
		
		minasTirith.signal();
	
	}

}
