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
		map.getBoard()[y-1][x-1].setType(type); 
		
		switch(map.getBoard()[y-1][x-1].getType()) {
			case 1 : 
				ResidentialBlock RB = new ResidentialBlock(50, 0, false, 500, 0, 0);
				map.getBoard()[y-1][x-1].setBlock(RB);
			break;
			case 2 : 
				CommercialBlock CB = new CommercialBlock(200, 0, false, 500, 0, 0);
				map.getBoard()[y-1][x-1].setBlock(CB);
			break;
			case 3 : 
				PublicServiceBlock PSB = new PublicServiceBlock(100, 0, false, 800);
				map.getBoard()[y-1][x-1].setBlock(PSB);
			break;
		}
						
	}
}
