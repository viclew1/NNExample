package fr.lewon.engine.geometry;

public abstract class Shape2D {

	private Point2D[] points;

	public Shape2D(Point2D... points) {
		this.points = points;
	}

	public Point2D[] getPoints() {
		return points;
	}

	public void setPoints(Point2D[] points) {
		this.points = points;
	}
	
	public void moveByVector(Point2D moveVector) {
		for (Point2D point : points) {
			point.moveByVector(moveVector);
		}
	}
	
	public void moveToPoint(Point2D destPoint) {
		for (Point2D point : points) {
			point.moveToPoint(destPoint);
		}
	}
}
