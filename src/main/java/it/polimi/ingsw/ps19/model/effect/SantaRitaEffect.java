package it.polimi.ingsw.ps19.model.effect;

/**
 * @author matteo
 *
 */
public class SantaRitaEffect extends Effect{

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Everytime you gain coins, woods, stones or servants from a development card"
				+ "effect, it is duplicate");
		return builder.toString();
	}

	@Override
	public void applyEffect() {
		// TODO Auto-generated method stub
		
	}

	
}
