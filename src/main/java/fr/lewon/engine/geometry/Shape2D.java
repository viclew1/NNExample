package fr.lewon.engine.geometry;

public abstract class Shape2D {

	private final Point2D center;
	private final Point2D[] points;

	public Shape2D(Point2D... points) {
		this.points = points;
		center = calculateCenter();
	}

	public Point2D calculateCenter() {
		double xCenter = 0;
		double yCenter = 0;

		for (Point2D p : points) {
			xCenter += p.getX();
			yCenter += p.getY();
		}

		xCenter /= points.length;
		yCenter /= points.length;

		return new Point2D(xCenter, yCenter);
	}

	public Point2D getCenter() {
		return center;
	}

	public Point2D[] getPoints() {
		return points;
	}

	public void moveByVector(Point2D moveVector) {
		for (Point2D point : points) {
			point.moveByVector(moveVector);
		}
		center.moveByVector(moveVector);
	}

	public void moveToPoint(Point2D destPoint) {
		Point2D moveVector = GeometryUtils.INSTANCE.minusOperation(destPoint, this.center);
		for (Point2D point : points) {
			point.moveByVector(moveVector);
		}
		center.moveToPoint(destPoint);
	}

	public void revolveAround(Point2D point, double radius) {
		for (Point2D p : points) {
			p.revolveAround(point, radius);
		}
		center.revolveAround(point, radius);
	}

}
