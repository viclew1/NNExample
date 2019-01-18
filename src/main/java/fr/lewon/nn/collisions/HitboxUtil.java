package fr.lewon.nn.collisions;

import java.util.ArrayList;
import java.util.List;

import fr.lewon.nn.collisions.hitbox.Hitbox;
import fr.lewon.nn.trials.elements.SimuElement;
import javafx.scene.shape.Rectangle;
import javafx.scene.shape.Shape;
import javafx.scene.transform.Rotate;
import javafx.scene.transform.Transform;

public enum HitboxUtil {

	INSTANCE;
	
	private HitboxUtil() {}
	
	/**
	 * Generates a rectangle Hitbox with the point (<b>xCenter, yCenter</b>) as its center, <b>w</b> as its width and <b>h</b> as its height
	 * 
	 * @param xCenter
	 * @param yCenter
	 * @param w
	 * @param h
	 * @return
	 */
	public Hitbox generateSquareHitbox(double xCenter, double yCenter, double w, double h) {
		return new Hitbox(new Rectangle(xCenter - w/2, yCenter - h/2, w, h));
	}
	
	/**
	 * Returns the list of Intersections between the two passed elements and their sub elements
	 * 
	 * @param se1
	 * @param se2
	 * @return
	 */
	public List<Intersection> getIntersections(SimuElement se1, SimuElement se2) {
		List<Intersection> intersections = new ArrayList<>();
		
		List<SimuElement> allSe1Elements = new ArrayList<>();
		allSe1Elements.addAll(se1.getSubElements());
		allSe1Elements.add(se1);

		List<SimuElement> allSe2Elements = new ArrayList<>();
		allSe1Elements.addAll(se2.getSubElements());
		allSe1Elements.add(se2);
		
		for (SimuElement subSe1 : allSe1Elements) {
			for (SimuElement subSe2 : allSe2Elements) {
				if (intersects(subSe1, subSe2)) {
					intersections.add(new Intersection(subSe1, subSe2));
				}
			}
		}
		return intersections;
	}
	
	public boolean intersects(SimuElement se1, SimuElement se2) {
		return se1.getHitbox().getShape().getBoundsInParent().intersects(se2.getHitbox().getShape().getBoundsInParent());
	}
	
	public void rotateSimuElement(SimuElement se, double radius) {
		
	}
	
	public void moveSimuElementForward(SimuElement se, double radius, double distance) {
	}
	
	public void rotateSimuElementAround(SimuElement se, double xRot, double yRot, double radius) {
		Rotate rotation = new Rotate(radius, xRot, yRot);
		addTransform(se.getHitbox().getShape(), rotation);
		for (SimuElement subSe : se.getSubElements()) {
			addTransform(subSe.getHitbox().getShape(), rotation);
		}
	}
	
	private void addTransform(Shape s, Transform transform) {
		s.getTransforms().add(transform);
	}

}
