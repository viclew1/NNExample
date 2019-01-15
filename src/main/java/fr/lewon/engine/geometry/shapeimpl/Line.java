package fr.lewon.engine.geometry.shapeimpl;

import fr.lewon.engine.geometry.Point2D;

public class Line {

	private Point2D from;
	private Point2D to;
	
	
	public Line(Point2D from, Point2D to) {
		this.from = from;
		this.to = to;
	}
	
	
	public Point2D getFrom() {
		return from;
	}
	public void setFrom(Point2D from) {
		this.from = from;
	}
	public Point2D getTo() {
		return to;
	}
	public void setTo(Point2D to) {
		this.to = to;
	}
	
}
