package fr.lewon.nn.collisions.hitbox;

import javafx.scene.shape.Shape;

public class Hitbox {

	private final Shape shape;
	
	public Hitbox(Shape shape) {
		this.shape = shape;
	}

	public Shape getShape() {
		return shape;
	}
	
}
