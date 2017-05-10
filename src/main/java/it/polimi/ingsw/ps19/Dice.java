package it.polimi.ingsw.ps19;

import java.util.Random;

public enum Dice {
	//could return an ActionValue instead of an int?
	ORANGE_DICE(Color.ORANGE), BLACK_DICE(Color.BLACK), WHITE_DICE(Color.WHITE);
	
	private Color color;   //Vediamo come vogliamo modellare il colore, è un attributo
						   //o basta il nome? io provo così
	private int displayedFace;
	
	private Dice(Color color){
		this.color = color;
		displayedFace = 0;
	}
	
	private void roll(){     					
		Random random = new Random();
		this.displayedFace = random.nextInt(6)+1;
	}
	
	public int getUpperFaceValue() {
		return this.displayedFace;
	}
	
	public int getRandomFaceValue(){   
		this.roll();
		return this.getUpperFaceValue();
	}
	
	public Color getColor() {
		return color;
	}
	
}