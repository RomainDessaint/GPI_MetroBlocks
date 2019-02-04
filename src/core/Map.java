package core;

public class Map {
	private Tile[][] board;
	
	public Map() {
	}

	public Map(Tile[][] board) {
		this.board = board;
	}
	
	public Tile[][] createBoard(int sizeX, int sizeY) {
		Tile[][] board = new Tile[sizeY][sizeX];
		int i, j;
		
		for(i=0; i<sizeY; i++) {
			for(j=0; j<sizeX; j++) {
				board[i][j] = new Tile(i, j);
			}
		}
		return board;
	}
	
	public void printBoard() {
		int i, j, sizeX, sizeY;
		sizeX = this.getBoard().length;
		if(sizeX == 0) 
			sizeY = 0;
		else 
			sizeY = this.getBoard()[0].length;
		
		for(i=0; i<sizeX; i++) {
			for(j=0; j<sizeY; j++) {
				System.out.print("X ");
			}
			System.out.print("\n");
		}
	}

	public Tile[][] getBoard() {
		return board;
	}

	public void setBoard(Tile[][] board) {
		this.board = board;
	}
	
	public int getXSize() {
		return this.getBoard().length;
	}
	
	public int getYSize() {
		if(this.getXSize() == 0)
			return 0;
		else 
			return this.getBoard()[0].length;
	}
}

