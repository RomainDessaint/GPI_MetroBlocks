package core;

public class Map {
	private Tile[][] board;
	
	public Map() {
	}

	public Map(Tile[][] board) {
		this.board = board;
	}
	
	//Fonction de création et de remplissage du tableau de tuiles
	public Tile[][] createBoard(int sizeX, int sizeY) {
		//Création du tableau à deux dimensions
		Tile[][] board = new Tile[sizeY][sizeX];	
		int i, j;
		
		//Remplissage du tableau
		for(i=0; i<sizeY; i++) {
			for(j=0; j<sizeX; j++) {
				board[i][j] = new Tile(i, j, 0, null); //Initialisation de chaque tuile (Type = 0 et Block = null)
			}
		}
		return board;
	}
	
	//Fonction d'affichage de la carte en mode console
	public void printBoard() {
		int i, j, sizeX, sizeY;
		//Longueur et largeur de la carte 
		sizeX = this.getXSize();
		sizeY = this.getYSize();
		
		//PArcours du tableau de tuile
		for(i=0; i<sizeY; i++) {
			for(j=0; j<sizeX; j++) {
				Tile currentTile = this.getBoard()[i][j];
				//Affichage variant selon le type de la case
				switch(currentTile.getType()) {
					case 0 : System.out.print("X ");
					break;
					case 1 : System.out.print("R ");
					break;
					case 2 : System.out.print("C ");
					break;
					case 3 : System.out.print("P ");
					break;
				}
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
	
	//Fonction pour obtenir la longueur de la carte (abscisse)
	public int getXSize() {
		if(this.getYSize() == 0)
			return 0;
		else 
			return this.getBoard()[0].length;
	}
	
	//Fonction pour obtenir la taille de la carte (ordonnée)
	public int getYSize() {
		return this.getBoard().length;
	}
}

