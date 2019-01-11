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


	/**
	 * Turns around the passed point by the passed radius
	 * @param point
	 * @param angle
	 */
	public void revolveAround(Point2D point, double radius) {
		moveByVector(GeometryUtils.INSTANCE.getOpposite(point));
		this.x = x * Math.cos(radius) - y * Math.sin(radius);
		this.y = y * Math.cos(radius) + x * Math.sin(radius);
		moveByVector(point);
	}

	public void moveByVector(Point2D moveVector) {
		moveByVector(moveVector.x, moveVector.y);
	}

	public void moveByVector(double x, double y) {
		this.x += x;
		this.y += y;
	}

	public void moveToPoint(Point2D destPoint) {
		moveToPoint(destPoint.x, destPoint.y);
	}

	public void moveToPoint(double x, double y) {
		this.x = x;
		this.y = y;
	}

}
