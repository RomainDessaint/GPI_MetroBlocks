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

	public int getMaxPopulation() {
		return maxPopulation;
	}

	public void setMaxPopulation(int maxPopulation) {
		this.maxPopulation = maxPopulation;
	}

	public int getCurrentPopulation() {
		return currentPopulation;
	}

	public void setCurrentPopulation(int currentPopulation) {
		this.currentPopulation = currentPopulation;
	}

	public boolean isHaveStation() {
		return haveStation;
	}

	public void setHaveStation(boolean haveStation) {
		this.haveStation = haveStation;
	}
}
