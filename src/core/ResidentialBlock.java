package core;

public class ResidentialBlock extends Block {
	private int tax;
	private int averageTransportTime;
	private int satisfaction;
	
	public ResidentialBlock(String name ,int maxPopulation, int currentPopulation, boolean haveStation,Station station, int tax,
			int averageTransportTime, int satisfaction) {
		super(name, maxPopulation, currentPopulation, haveStation, station);
		this.tax = tax;
		this.averageTransportTime = averageTransportTime;
		this.satisfaction = satisfaction;
	}

	public int getTax() {
		return tax;
	}

	public void setTax(int tax) {
		this.tax = tax;
	}

	public int getAverageTransportTime() {
		return averageTransportTime;
	}

	public void setAverageTransportTime(int averageTransportTime) {
		this.averageTransportTime = averageTransportTime;
	}

	public int getSatisfaction() {
		return satisfaction;
	}

	public void setSatisfaction(int satisfaction) {
		this.satisfaction = satisfaction;
	}
}
