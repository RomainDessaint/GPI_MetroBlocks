package core;


public class Main {

	public static void main(String[] args) {
		
		   
		    
		Map map = new Map();
		Tile[][] board = map.createBoard(20, 10);
		map.setBoard(board);
		
		System.out.println("Cr�ation de la MAP");
		
		map.printBoard();
		
		BlockCreator blockCreator = new BlockCreator(map);
		blockCreator.askCoordinate();
		
		System.out.println("Cr�ation du QUARTIER");
		map.printBoard();
		
		StationCreator stationCreator = new StationCreator(map);
		stationCreator.askCoordinateStation();
		
		System.out.println("Cr�ation de la STATION");
		map.printBoard();
	}
}



