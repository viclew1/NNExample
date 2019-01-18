package fr.lewon.nn.trials.elements.creatures;

import java.util.List;

import fr.lewon.Individual;
import fr.lewon.exceptions.NNException;
import fr.lewon.nn.collisions.HitboxUtil;
import fr.lewon.nn.trials.elements.SimuElement;

public abstract class SimuCharacter extends SimuElement {
	
	private CreatureType creatureType;
	private Individual brain;

	
	public SimuCharacter(double xCenter, double yCenter, CreatureType creatureType, Individual brain) {
		super(HitboxUtil.INSTANCE.generateSquareHitbox(xCenter, yCenter, creatureType.getBaseWidth(), creatureType.getBaseHeight()), true);
		this.creatureType = creatureType;
		this.brain = brain;
	}
	
	
	@Override
	public void updatePosition() throws NNException {
		List<Double> nnOutputs = brain.getOutputs(getNNInputs());
		applyDecisions(nnOutputs);
	}
	
	protected abstract List<Double> getNNInputs();

	protected abstract void applyDecisions(List<Double> nnOutputs);
}
