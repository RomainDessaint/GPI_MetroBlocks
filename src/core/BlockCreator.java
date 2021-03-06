package core;

import java.util.Scanner;

public class BlockCreator {
	
	Map map;			//Carte sur laquelle le cr�ateur agit
	Scanner scanner;
	
	public BlockCreator(Map map) {
		this.map = map;
		this.scanner = new Scanner(System.in);
	}
	
	//Fonction de sp�cification des coordonn�es/type de cr�ation d'un quartier
	public void askCoordinate() {
		int x, y, type;
		System.out.println("Coordonn�e X ?");
		x = scanner.nextInt();
		System.out.println("Coordonn�e Y ?");
		y = scanner.nextInt();
		System.out.println("Type du quartier ?");
		type = scanner.nextInt();
		createBlock(x, y, type);
	}

	//Fonction de cr�ation d'un quartier
	void createBlock(int x, int y, int type) {
		if(map.getBoard()[y-1][x-1].getType() == 0) {
			map.getBoard()[y-1][x-1].setType(type); 
			switch(map.getBoard()[y-1][x-1].getType()) {
				case 1 : 
					ResidentialBlock residentialBlock = new ResidentialBlock(50, 0, false,null, 500, 0, 0);
					map.getBoard()[y-1][x-1].setBlock(residentialBlock);
				break;
				case 2 : 
					CommercialBlock commercialBlock = new CommercialBlock(200, 0, false, null, 500, 0, 0);
					map.getBoard()[y-1][x-1].setBlock(commercialBlock);
				break;
				case 3 : 
					PublicServiceBlock publicServiceBlock = new PublicServiceBlock(100, 0, false, null, 800);
					map.getBoard()[y-1][x-1].setBlock(publicServiceBlock);
				break;
			}
			System.out.println("Quartier correctement cr��.\n");
		} else {	
			System.out.println("Un quartier existe d�ja � cet emplacement...");
		}
	}
}
