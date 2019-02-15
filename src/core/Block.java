package core;

public abstract class Block {
	private int maxPopulation;
	private int currentPopulation;
	private boolean haveStation;
	private Station station;
	
	public Block(int maxPopulation, int currentPopulation, boolean haveStation,Station station) {
		this.maxPopulation = maxPopulation;
		this.currentPopulation = currentPopulation;
		this.haveStation = haveStation;
		this.station = station;

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

	public Station getStation() {
		return station;
	}

	public void setStation(Station station) {
		this.station = station;
	}
}
