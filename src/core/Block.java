package core;

public abstract class Block {
	private int maxPopulation;
	private int currentPopulation;
	private boolean haveStation;
	
	public Block(int maxPopulation, int currentPopulation, boolean haveStation) {
		this.maxPopulation = maxPopulation;
		this.currentPopulation = currentPopulation;
		this.haveStation = haveStation;
	}
	
	
}
