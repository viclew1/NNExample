package fr.lewon.nn.trials.elements.creatures;

import fr.lewon.Individual;
import fr.lewon.engine.geometry.Point2D;

public class Dodger extends SimuCharacter {

	public Dodger(Point2D location, Individual brain) {
		super(location, CreatureType.DODGER, brain);
	}

}
