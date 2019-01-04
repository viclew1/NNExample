package fr.lewon.nn.trials.elements.creatures;

public enum CreatureType {

	DODGER(1, 3);
	
	private final double baseSize;
	private final double baseSpeed;
	
	private CreatureType(double baseSize, double baseSpeed) {
		this.baseSize = baseSize;
		this.baseSpeed = baseSpeed;
	}

	public double getBaseSize() {
		return baseSize;
	}

	public double getBaseSpeed() {
		return baseSpeed;
	}
	
	
 }
