package it.polimi.ingsw.ps19.model.effect;

<<<<<<< HEAD
import it.polimi.ingsw.ps19.FamilyMember;
import it.polimi.ingsw.ps19.Player;
import it.polimi.ingsw.ps19.model.card.DevelopmentCard;

/**
 * @author Mirko
 *
 */
=======
>>>>>>> 60abc8b3ecf74a408486a3993b044d1cfe57681d
public abstract class Effect {

	public abstract void applyEffect();
	
<<<<<<< HEAD

	

	/**
	 * @return
	 */
	public DevelopmentCard getCard() {
		return card;
	}

	/**
	 * remember that we have to establish an association between effect and card at the moment of instantiating the cards, (from file)
	 * @param card
	 */
	public void setCard(DevelopmentCard card) {
		this.card = card;
	}
	
	/**
	 * @author Jimmy 
	 * @return Player, the player associated with the card that has the specific effect, this method is created to make the "call chain" shorter.
	 */
	public Player getAssociatedPlayer(){
		return card.getPlayer();
	}
	

=======
>>>>>>> 60abc8b3ecf74a408486a3993b044d1cfe57681d
}
