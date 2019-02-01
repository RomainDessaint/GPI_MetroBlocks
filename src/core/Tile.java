package core;

public class Tile {
	private int coordinateX;		//Coordonnée X de la tuile dans la carte
	private int coordinateY;		//Coordonnée Y de la tuile dans la carte
	
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