import java.awt.geom.*;
import java.util.Scanner;

public final class Main {

	static Scanner scanner;

	private static Rectangle max(Rectangle[] t) throws IllegalArgumentException {
		if (t == null) {
			throw new IllegalArgumentException("param t cannot be null");
		}
		Rectangle max  = t[0];
		for (Rectangle r : t) {
			if (max.surface() < r.surface()) {
				max = r;
			}
		}
		return max;
	}

	private static Rectangle creerRectangle() {
		double x1, y1, x2, y2;

		System.out.println("Entrez x1 y1 x2 y2");
		x1 = scanner.nextInt();
		y1 = scanner.nextInt();
		x2 = scanner.nextInt();
		y2 = scanner.nextInt();

		return new Rectangle(x1, y1, x2, y2);

	}

	public final static void main(String[] args) {
		scanner = new Scanner(System.in);

		System.out.println("Nombre de Rectangles : ");
		int nbRec =scanner.nextInt();

		Rectangle[] tabRec = new Rectangle[nbRec];

		for(int i = 0; i < tabRec.length; i++) {
			tabRec[i] = creerRectangle();	
		}

		for(Rectangle r : tabRec) {
			System.out.println(r);
		}

		for (Rectangle r : tabRec) {
			r.setOrigineX();
		}

		for(Rectangle r : tabRec) {
			System.out.println(r);
		}

		System.out.println("Rectangle de plus grande surface :");
		System.out.println(max(tabRec));

	}
}