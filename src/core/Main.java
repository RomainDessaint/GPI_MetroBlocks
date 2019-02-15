package core;


public class Main {

	public static void main(String[] args) {
		
		   
		    
		Map map = new Map();
		Tile[][] board = map.createBoard(20, 10);
		map.setBoard(board);
		
		System.out.println("Création de la MAP");
		
		map.printBoard();
		
		BlockCreator blockCreator = new BlockCreator(map);
		blockCreator.askCoordinate();
		
		System.out.println("Création du QUARTIER");
		map.printBoard();
		
		StationCreator stationCreator = new StationCreator(map);
		stationCreator.askCoordinateStation();
		
		System.out.println("Création de la STATION");
		map.printBoard();
	}
}



