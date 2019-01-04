package fr.lewon.engine.geometry;

public class Point2D {

	private double x;
	private double y;
	
	
	public Point2D() {
		this(0, 0);
	}

	public Point2D(double x, double y) {
		this.x = x;
		this.y = y;
	}

	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}

	public void moveByVector(Point2D moveVector) {
		x += moveVector.x;
		y += moveVector.y;
	}
	
	public void moveToPoint(Point2D destPoint) {
		x = destPoint.x;
		y = destPoint.y;
	}
}
