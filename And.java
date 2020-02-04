
public final class And {
	// Variables d'instances
	private boolean e1, e2, s;

	// Methodes
	public void setE1(boolean etat) {
		this.e1 = etat;
	}

	public void setE2(boolean etat) {
		this.e2 = etat;
	}

	public void run() {
		s = e1 && e2;
	}

	public void display() {
		System.out.println(s);	
	}

	public String toString() {
		return 
			"[e1 = " 
			+ String.valueOf(e1)
			+ " e2 ="
			+ e2
			+ " s= "
			+ s
			+ "]";
	}
} 