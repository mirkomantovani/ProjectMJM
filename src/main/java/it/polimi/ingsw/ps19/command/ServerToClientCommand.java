package it.polimi.ingsw.ps19.command;

import java.io.Serializable;

public abstract class ServerToClientCommand implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6460847901998831472L;
	
	public abstract void processCommand(ClientCommandHandler clientCommandHandler);

}
