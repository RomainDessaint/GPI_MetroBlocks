package core;

import java.util.Scanner;

public class BlockCreator {
	
	Map map;
	Scanner scanner;
	
	public BlockCreator(Map map) {
		this.map = map;
		this.scanner = new Scanner(System.in);
	}
	
	void askCoordinate() {
		int x, y, type;
		System.out.println("Coordonnée X ?");
		x = scanner.nextInt();
		System.out.println("Coordonnée Y ?");
		y = scanner.nextInt();
		System.out.println("Type du quartier ?");
		type = scanner.nextInt();
		createBlock(map, x, y, type);
	}

	void createBlock(Map map, int x, int y, int type) {	
		int i, j;
		int sizeX = map.getXSize();
		int sizeY = map.getYSize();
		
		map.getBoard()[y-1][x-1].setType(type); 
	}
}
