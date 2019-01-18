package fr.lewon.nn.trials.elements;

import java.util.ArrayList;
import java.util.List;

import fr.lewon.exceptions.NNException;
import fr.lewon.nn.collisions.hitbox.Hitbox;

public abstract class SimuElement {

	private final Hitbox hitbox;
	private final List<SimuElement> subElements;
	private final List<SimuElement> allElements;
	private boolean collidable;

	
	public SimuElement(Hitbox hitbox, boolean collidable) {
		this.hitbox = hitbox;
		this.collidable = collidable;
		subElements = new ArrayList<>();
		allElements = new ArrayList<>();
	}
	
	
	public Hitbox getHitbox() {
		return hitbox;
	}
	public boolean isCollidable() {
		return collidable;
	}
	public void setCollidable(boolean collidable) {
		this.collidable = collidable;
	}
	public List<SimuElement> getSubElements() {
		return subElements;
	}
	public List<SimuElement> getAllElements() {
		if (allElements.size() != subElements.size() + 1) {
			refreshAllElements();
		}
		return allElements;
	}
	
	private void refreshAllElements() {
		allElements.clear();
		allElements.add(this);
		allElements.addAll(subElements);
	}

	public abstract void updatePosition() throws NNException;
	
	public abstract void processIntersection(SimuElement intersectedElement);
}
