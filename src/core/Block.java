package core;

public abstract class Block {
	private String name;
	private int maxPopulation;			//Population maximum du quartier
	private int currentPopulation;		//Population actuelle du quartier
	private boolean hasStation;		//True si la station possède une station, false sinon
	private Station station;			//Station construite dans ce quartier
	
	public Block(String name, int maxPopulation, int currentPopulation, boolean haveStation, Station station) {
		this.name = name;
		this.maxPopulation = maxPopulation;
		this.currentPopulation = currentPopulation;
		this.hasStation = haveStation;
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

	public boolean isHasStation() {
		return hasStation;
	}

	public void setHaveStation(boolean haveStation) {
		this.hasStation = haveStation;
	}

	public Station getStation() {
		return station;
	}

	public void setStation(Station station) {
		this.station = station;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
}
