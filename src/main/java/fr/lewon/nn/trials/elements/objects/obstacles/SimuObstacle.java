package fr.lewon.nn.trials.elements.objects.obstacles;

import fr.lewon.engine.geometry.Shape2D;
import fr.lewon.nn.trials.elements.objects.SimuItem;

public abstract class SimuObstacle extends SimuItem {

	public SimuObstacle(Shape2D hitbox) {
		super(hitbox);
	}

}
