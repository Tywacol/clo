/**
 *
 * @author Bernard.Carre@polytech-lille.fr
 */

public abstract class Composant {
	
	public String getId() {
		
		return super.toString(); // class@numero renvoye par Object
		
	}

	public String description() {
		return getId();
	}

	public abstract boolean getEtat() throws NonConnecteException;
	
}