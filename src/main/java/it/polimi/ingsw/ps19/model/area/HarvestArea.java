package it.polimi.ingsw.ps19.model.area;

import java.util.List;

import it.polimi.ingsw.ps19.Player;
import it.polimi.ingsw.ps19.model.card.CardType;
import it.polimi.ingsw.ps19.model.card.DevelopmentCard;
import it.polimi.ingsw.ps19.model.effect.Effect;
import it.polimi.ingsw.ps19.model.effect.HarvestBonusEffect;
import it.polimi.ingsw.ps19.model.resource.ResourceChest;

/**
 * @author Jimmy
 *
 */
public class HarvestArea extends IndustrialArea{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 813593501545744521L;
	Effect personalEffect;
	
	public HarvestArea(){
		super();
		//The "MALUS" constant is defined in IndustrialArea
		this.multipleSlot = new MultipleActionSpace(SLOT_COST, new HarvestBonusEffect(MALUS));
		
		
	}

	@Override
	public List<DevelopmentCard> getPlayerCards(Player player) {
			
		return player.getDeckOfType(CardType.TERRITORY);
	}
	
	
	public String toString(){
		return "-------------------- The harvest area --------------------" +
				super.toString();
	}

}
