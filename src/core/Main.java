package core;

public class Main {

	public static void main(String[] args) {
		Map map = new Map();
		Tile[][] board = map.createBoard(20, 10);
		map.setBoard(board);
		map.printBoard();
		BlockCreator blockCreator = new BlockCreator(map);
		blockCreator.askCoordinate();
		map.printBoard();
	}
}



