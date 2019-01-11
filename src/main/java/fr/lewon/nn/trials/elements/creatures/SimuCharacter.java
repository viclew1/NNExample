package fr.lewon.nn.trials.elements.creatures;

import fr.lewon.Individual;
import fr.lewon.engine.geometry.GeometryUtils;
import fr.lewon.engine.geometry.Point2D;
import fr.lewon.nn.trials.elements.SimuElement;

public abstract class SimuCharacter extends SimuElement {
	
	private CreatureType creatureType;
	private Individual brain;

	
	public SimuCharacter(Point2D location, CreatureType creatureType, Individual brain) {
		super(GeometryUtils.INSTANCE.generateSquare(location, creatureType.getBaseSize()));
		this.creatureType = creatureType;
		this.brain = brain;
	}
	
}
