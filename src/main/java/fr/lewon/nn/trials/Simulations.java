package fr.lewon.nn.trials;

import fr.lewon.nn.trials.impl.DodgeSimu;
import fr.lewon.nn.trials.impl.DriveSimu;
import fr.lewon.nn.trials.impl.EatingSimu;

public enum Simulations {

	DODGE_SIMU("Dodge simulation", new DodgeSimu()),
	EATING_SIMU("Eating simulation", new EatingSimu()),
	DRIVE_SIMU("Drive simulation", new DriveSimu());
	
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
