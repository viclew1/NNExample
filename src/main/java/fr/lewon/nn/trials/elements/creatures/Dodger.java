package fr.lewon.nn.trials.elements.creatures;

import java.util.List;

import fr.lewon.Individual;
import fr.lewon.nn.trials.elements.SimuElement;

public class Dodger extends SimuCharacter {

	public Dodger(double xCenter, double yCenter, Individual brain) {
		super(xCenter, yCenter, CreatureType.DODGER, brain);
	}

	@Override
	public void processIntersection(SimuElement intersectedElement) {
		// TODO Auto-generated method stub
		
	}

	@Override
	protected List<Double> getNNInputs() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected void applyDecisions(List<Double> nnOutputs) {
		// TODO Auto-generated method stub
		
	}

}
