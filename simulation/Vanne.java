/**
 *
 * @author Bernard.Carre@polytech-lille.fr
 */

public class Vanne extends Composant {
	//...
	
	public boolean getEtat() throws NonConnecteException {
		
		if (in == null) {
			
			throw new NonConnecteException();
			
		} else {
			
			return in.getEtat();
			
		}
	}	
}