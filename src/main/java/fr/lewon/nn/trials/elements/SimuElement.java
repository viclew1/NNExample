package fr.lewon.nn.trials.elements;

import fr.lewon.engine.geometry.Shape2D;

public abstract class SimuElement {

	/**
	 * Element's hit box shape, the zone of contact between it and other elements
	 */
	private Shape2D hitbox;

	
	
	public Shape2D getHitbox() {
		return hitbox;
	}

	public void setHitbox(Shape2D hitbox) {
		this.hitbox = hitbox;
	}
	
}
