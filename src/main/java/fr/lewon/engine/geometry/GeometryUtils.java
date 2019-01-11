package fr.lewon.engine.geometry;

import fr.lewon.engine.geometry.shapeimpl.Square;

public enum GeometryUtils {

	INSTANCE;

	private GeometryUtils() {}

	/**
	 * Generates a square based on the passed parameters
	 * @param center the center of the square
	 * @param sideSize the size of a side of the square
	 * @return the generated square
	 */
	public Shape2D generateSquare(Point2D center, double sideSize) {
		Point2D p1 = new Point2D(0, 0); 				// Top left
		Point2D p2 = new Point2D(sideSize, 0);			// Top right
		Point2D p3 = new Point2D(sideSize, sideSize);	// Bottom right
		Point2D p4 = new Point2D(0, sideSize);			// Bottom left
		Shape2D square = new Square(p1, p2, p3, p4);
		square.moveToPoint(center);
		return square;
	}

	/**
	 * Gets the symmetry of the passed point by the origin (0, 0)
	 * @param p
	 * @return
	 */
	public Point2D getOpposite(Point2D p) {
		return new Point2D(-p.getX(), -p.getY());
	}

	/**
	 * Calculates the result of the subtraction of point p1 by point p2
	 * @param p1
	 * @param p2
	 * @return
	 */
	public Point2D minusOperation(Point2D p1, Point2D p2) {
		double xResult = p1.getX() - p2.getX();
		double yResult = p1.getY() - p2.getY();
		return new Point2D(xResult, yResult);
	}

	/**
	 * Calculates the result of the sum of point p1 and point p2
	 * @param p1
	 * @param p2
	 * @return
	 */
	public Point2D plusOperation(Point2D p1, Point2D p2) {
		double xResult = p1.getX() + p2.getX();
		double yResult = p1.getY() + p2.getY();
		return new Point2D(xResult, yResult);
	}

}
