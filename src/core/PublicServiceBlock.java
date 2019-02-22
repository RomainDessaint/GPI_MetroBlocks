package core;

public class PublicServiceBlock extends Block {
	private int cost;

	public PublicServiceBlock(int maxPopulation, int currentPopulation, boolean haveStation,Station station, int cost) {
		super(maxPopulation, currentPopulation, haveStation,station);
		this.cost = cost;
	}

	public int getCost() {
		return cost;
	}

	public void setCost(int cost) {
		this.cost = cost;
	}
}
