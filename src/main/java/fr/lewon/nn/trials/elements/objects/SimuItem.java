package fr.lewon.nn.trials.elements.objects;

import fr.lewon.nn.collisions.hitbox.Hitbox;
import fr.lewon.nn.trials.elements.SimuElement;

public abstract class SimuItem extends SimuElement {

	public SimuItem(Hitbox hitbox, boolean collidable) {
		super(hitbox, collidable);
	}

}
