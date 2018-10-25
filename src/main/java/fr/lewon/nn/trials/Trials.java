package fr.lewon.nn.trials;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import fr.lewon.Trial;
import fr.lewon.nn.trials.impl.*;

public enum Trials {

	DODGE_TRIAL("Dodge trial", new DodgeTrial()),
	EATING_TRIAL("Eating trial", new EatingTrial()),
	DRIVE_TRIAL("Drive trial", new DriveTrial());
	
	private final String displayName;
	private final Trial trial;
	
	private Trials(String displayName, Trial trial) {
		this.displayName = displayName;
		this.trial = trial;
	}

	public String getDisplayName() {
		return displayName;
	}

	public Trial getTrial() {
		return trial;
	}
	
	public String toString() {
		return displayName;
	}
}
