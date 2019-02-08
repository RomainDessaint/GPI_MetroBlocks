package core;

public class Tile {
	private int coordinateX;		//Coordonn�e X de la tuile dans la carte
	private int coordinateY;		//Coordonn�e Y de la tuile dans la carte
	private int type;				//Type de la tuile 
	private Block block; 
	
	public Tile(int coordinateX, int coordinateY, int type,Block block) {
		this.coordinateX = coordinateX;
		this.coordinateY = coordinateY;
		this.type = type;
		this.block = block;

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

	public Block getBlock() {
		return block;
	}

	public void setBlock(Block block) {
		this.block = block;
	}
	
	
	
}