package fr.lewon.engine.geometry;

import fr.lewon.engine.geometry.shapeimpl.Square;

public enum GeometryUtils {

	INSTANCE;

	private GeometryUtils() {}

	/**
	 * Returns a new Point2D with the same coordinates as the passed point 
	 * @param p
	 * @return
	 */
	public Point2D copyPoint(Point2D p) {
		return new Point2D(p.getX(), p.getY());
	}
	
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
	 * Gets a new Point2D with the coordinates of the passed 'p' after applying a rotation of 'radius' around 'center'
	 * @param p
	 * @param center
	 * @param radius
	 * @return
	 */
	public Point2D getRevolved(Point2D p, Point2D center, double radius) {
		Point2D rotatedP = copyPoint(p);
		rotatedP.revolveAround(center, radius);
		return rotatedP;
	}

	/**
	 * Gets the symmetry of the passed Point2D 'p' with respect to the point 'center'
	 * @param p
	 * @param center
	 * @return
	 */
	public Point2D getOpposite(Point2D p, Point2D center) {
		Point2D vectorPtoCenter = minusOperation(center, p);
		return plusOperation(center, vectorPtoCenter);
	}
	
	/**
	 * Gets the symmetry of the passed Point2D 'p' with respect to the origin (0, 0)
	 * @param point
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
