package core;

public class Tile {
	private int coordinateX;		//Coordonnée X de la tuile dans la carte
	private int coordinateY;		//Coordonnée Y de la tuile dans la carte
	private int type;				//Type de la tuile 
	
	public Tile(int coordinateX, int coordinateY, int type) {
		this.coordinateX = coordinateX;
		this.coordinateY = coordinateY;
		this.type = type;
	}

	public int getCoordinateX() {
		return coordinateX;
	}

	public int getCoordinateY() {
		return coordinateY;
	}
	
	public int getType() {
		return type;
	}
	
	public void setType(int type) {
		this.type = type;
	}
}