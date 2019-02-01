package core;

public class Tile {
	private int coordinateX;		//Coordonn�e X de la tuile dans la carte
	private int coordinateY;		//Coordonn�e Y de la tuile dans la carte
	
	public Tile(int coordinateX, int coordinateY) {
		this.coordinateX = coordinateX;
		this.coordinateY = coordinateY;
	}

	public int getCoordinateX() {
		return coordinateX;
	}

	public int getCoordinateY() {
		return coordinateY;
	}
}