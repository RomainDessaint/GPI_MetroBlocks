package core;

public class Map {
	private Tile[][] board;		//Tableau à deux dimensions de tuiles
	
	public Map() {
	}

	public Map(Tile[][] board) {
		this.board = board;
	}
	
	//Fonction de création de la carte
	public Tile[][] createBoard(int sizeX, int sizeY) {
		//Création d'un tableau à deux dimension de tuiles
		Tile[][] board = new Tile[sizeY][sizeX];					
		int i, j;
		
		//Remplissage de chaque case du tableau par une tuile 
		for(i=0; i<sizeY; i++) {		
			for(j=0; j<sizeX; j++) {
				board[i][j] = new Tile(i, j);
			}
		}
		return board;
	}
	
	//Fonction permettant d'obtenir une tuile en fonction de ses coordonnées X et Y
	public Tile getTileByCoordinate(int boardX, int boardY) {
		return this.getBoard()[boardX][boardY];
	}
	
	//Fonction d'affichage console du tableau de tuile
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
}

