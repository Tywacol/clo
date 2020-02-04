

public class TestCircuits {

	public void printIds(Composant[] composants) {
		for (Composant c : composants) {
			System.out.println(c.getId());
		}
	}

	public static void descriptions(Composant[] composants) {
		for (Composant c : composants) {
			System.out.println(c.description());
		}
	}

	public static void main(String[] args) {

		//Construction
		int nbComposants = 7;
		Composant[] composants = new Composant[nbComposants];
		composants[0] = new Or();
		composants[1] = new Not();
		composants[2] = new And();
		composants[3] = new Vanne();
		composants[4] = new Interrupteur();
		composants[5] = new Interrupteur();
		composants[6] = new Interrupteur();

		
		//Connexions
		((Or)composants[0]).setIn1(composants[4]);
		((Or)composants[0]).setIn2(composants[5]);

		((Not)composants[1]).setIn(null);

		((And)composants[2]).setIn1(composants[0]);
		((And)composants[2]).setIn2(composants[1]);

		((Vanne)composants[3]).setIn(composants[2]);
		
		//Affichage
		//printIds(composants);
		descriptions(composants);

		
		System.out.println("Au revoir!");
	}
}