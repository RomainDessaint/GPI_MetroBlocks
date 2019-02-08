package core;

public class PublicServiceBlock extends Block {
	private int cost;

	public PublicServiceBlock(int maxPopulation, int currentPopulation, boolean haveStation, int cost) {
		super(maxPopulation, currentPopulation, haveStation);
		this.cost = cost;
	}
	
	
}
