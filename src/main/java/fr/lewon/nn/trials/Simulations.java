package fr.lewon.nn.trials;

import fr.lewon.nn.trials.impl.DodgeTrial;
import fr.lewon.nn.trials.impl.DriveTrial;
import fr.lewon.nn.trials.impl.EatingTrial;

public enum Simulations {

	DODGE_TRIAL("Dodge trial", new DodgeTrial()),
	EATING_TRIAL("Eating trial", new EatingTrial()),
	DRIVE_TRIAL("Drive trial", new DriveTrial());
	
	private final String displayName;
	private final Simulation simulation;
	
	private Simulations(String displayName, Simulation simulation) {
		this.displayName = displayName;
		this.simulation = simulation;
	}

	public String getDisplayName() {
		return displayName;
	}

	public Simulation getSimulation() {
		return simulation;
	}
	
	public String toString() {
		return displayName;
	}
}
