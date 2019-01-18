package fr.lewon.nn.trials.elements.creatures;

public enum CreatureType {

	DODGER(1, 1, 3);
	
	private final double baseWidth;
	private final double baseHeight;
	private final double baseSpeed;
	
	private CreatureType(double baseWidth, double baseHeight, double baseSpeed) {
		this.baseWidth = baseWidth;
		this.baseHeight = baseHeight;
		this.baseSpeed = baseSpeed;
	}

	public double getBaseSpeed() {
		return baseSpeed;
	}

	public double getBaseWidth() {
		return baseWidth;
	}
	
	public double getBaseHeight() {
		return baseHeight;
	}
 }
