/**
 *
 * @author Bernard.Carre@polytech-lille.fr
 */

public class Not extends Porte {
	//...
	
	public boolean getEtat() throws NonConnecteException {
		
		if (in == null) {
			
			throw new NonConnecteException();
			
		} else {
			
			return !in.getEtat();
			
		}
		
	}

}