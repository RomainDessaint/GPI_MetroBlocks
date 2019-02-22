package core;

public abstract class Block {
	private int maxPopulation;			//Population maximum du quartier
	private int currentPopulation;		//Population actuelle du quartier
	private boolean haveStation;		//True si la station possède une station, false sinon
	private Station station;			//Station construite dans ce quartier
	
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
