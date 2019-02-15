package core;


public class Main {

	public static void main(String[] args) {
		
		//CREATION DE LA CARTE DE JEU
		System.out.println("Cr�ation de la MAP");
		Map map = new Map();
		Tile[][] board = map.createBoard(20, 10);
		map.setBoard(board);
		map.printBoard();
		System.out.print("Taille de la carte : (" +map.getXSize() +", " +map.getYSize() +")\n");
		
		//CREATION D'UN QUARTIER 
		System.out.println("\nCr�ation d'un QUARTIER");
		BlockCreator blockCreator = new BlockCreator(map);
		blockCreator.askCoordinate();
		map.printBoard();
		
		//CREATION D'UNE STATION DE METRO
		System.out.println("\nCr�ation de la STATION");
		StationCreator stationCreator = new StationCreator(map);
		stationCreator.askCoordinateStation();
		map.printBoard();
	}
}



