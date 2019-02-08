package core;

public class CommercialBlock extends Block {
	private int tax;
	private int averageTransportTime;
	private int satisfaction;
	
	public CommercialBlock(int maxPopulation, int currentPopulation, boolean haveStation, int tax,
			int averageTransportTime, int satisfaction) {
		super(maxPopulation, currentPopulation, haveStation);
		this.tax = tax;
		this.averageTransportTime = averageTransportTime;
		this.satisfaction = satisfaction;
	}
}
