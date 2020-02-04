import java.awt.geom.*;

public class Rectangle {
	private Point2D.Double origine, corner;

	public Rectangle(double oX, double oY, double cX, double cY) {
		this.origine = new Point2D.Double(oX, oY);
		this.corner = new Point2D.Double(cX, cY);
	}

	public Rectangle(Point2D.Double origine, Point2D.Double corner) {
		this.origine = origine; this.corner = corner;
	}

	public double largeur() {
		return corner.getX() - origine.getX();
	}

	public void setOrigineX() {
		this.origine.x  =99;
	}


	public double longueur() {
		return corner.getY() - origine.getY();
	}

	public double surface() {
		return this.largeur() * this.longueur();
	}

	public double perimetre() {
		return 2 * (this.longueur() + this.largeur());
	}

	public String toString() {
		return "(" + this.origine + ", " + this.corner + ")";

	}

	public void afficherInfosRectangle() {
		System.out.printf("Largeur du Rectangle : %f%n", this.largeur());
		System.out.printf("Longeur du Rectangle : %f%n", this.longueur());
		System.out.printf("Surface du Rectangle : %f%n", this.surface());
		System.out.printf("Perimetre du Rectangle : %f%n", this.perimetre());
	}

}