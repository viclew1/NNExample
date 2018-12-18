package fr.lewon.nn.trials.simuobjects.creature;

import fr.lewon.Individual;
import fr.lewon.engine.geometry.Point2D;

public abstract class Creature {
	
	private CreatureType creatureType;
	private Point2D position;
	private Individual brain;
	
	public Creature(CreatureType creatureType, Point2D position, Individual brain) {
		this.creatureType = creatureType;
		this.position = position;
	}
	
}
