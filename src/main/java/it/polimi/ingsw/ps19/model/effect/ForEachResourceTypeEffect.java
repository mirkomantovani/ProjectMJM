package it.polimi.ingsw.ps19.model.effect;

import it.polimi.ingsw.ps19.model.Player;
import it.polimi.ingsw.ps19.model.resource.Resource;
import it.polimi.ingsw.ps19.model.resource.ResourceChest;

/**
 * This effect gives n resources for each m other resources.
 *
 * @author Jimmy
 */
public class ForEachResourceTypeEffect extends Effect{
	
	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 4487719962938874499L;
	
	/** The given resource. */
	private Resource givenResource;
	
	/** The to string resource. */
	private Resource toStringResource;  //This is used by the toString method to store a copy of the original givenResource that will be modified
	
	/** The foreach resource. */
	private Resource foreachResource;
	
	/**
	 * Instantiates a new for each resource type effect.
	 *
	 * @param givenResource the given resource
	 * @param foreachResource the foreach resource
	 */
	public ForEachResourceTypeEffect(Resource givenResource, Resource foreachResource){
		this.givenResource = givenResource;
		this.toStringResource = givenResource;
		this.foreachResource = foreachResource;
	}
	
	
	/**
	 * Calculate resource.
	 *
	 * @param player the player
	 * @return the resource
	 */
	private Resource calculateResource(Player player){
		int leftFactor = givenResource.getAmount();
		//based on the dynamic type of the foreacheResource it will set the right
		//factor to the "int casted" result of the division between the amount of
		//the resource held by the player and the amount of the passed resource
		int rightFactor = (int) player.getResourceChest().getResourceInChest(foreachResource).getAmount() / foreachResource.getAmount();
		//Non dovrebbe mai succedere che il foreach resource non sia uno di quei tipo

		
		this.givenResource.setAmount(leftFactor * rightFactor);
		return givenResource;
	}
	
	/* (non-Javadoc)
	 * @see it.polimi.ingsw.ps19.model.effect.Effect#applyEffect(it.polimi.ingsw.ps19.Player)
	 */
	public void applyEffect(Player player) {
		calculateResource(player);
		ResourceChest rs=new ResourceChest();
		rs.addResource(givenResource);
		player.addResources(rs);
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return toStringResource.toString() + " for each" + foreachResource.toString();
	}
	
	
}
