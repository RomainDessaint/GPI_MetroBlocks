package core;

import java.util.Scanner;

public class BlockCreator {
	
	Map map;			//Carte sur laquelle le créateur agit
	
	public BlockCreator(Map map) {
		this.map = map;
	}

	//Fonction de création d'un quartier
	public void createBlock(int x, int y, int type, String name) {
		if(map.getBoard()[y-1][x-1].getType() == 0) {
			map.getBoard()[y-1][x-1].setType(type); 
			switch(map.getBoard()[y-1][x-1].getType()) {
				case 1 : 
					ResidentialBlock residentialBlock = new ResidentialBlock(name, 50, 0, false,null, 500, 0, 0);
					map.getBoard()[y-1][x-1].setBlock(residentialBlock);
				break;
				case 2 : 
					CommercialBlock commercialBlock = new CommercialBlock(name, 200, 0, false, null, 500, 0, 0);
					map.getBoard()[y-1][x-1].setBlock(commercialBlock);
				break;
				case 3 : 
					PublicServiceBlock publicServiceBlock = new PublicServiceBlock(name, 100, 0, false, null, 800);
					map.getBoard()[y-1][x-1].setBlock(publicServiceBlock);
				break;
			}
			System.out.println("Quartier correctement créé.\n");
		} else {	
			System.out.println("Un quartier existe déja à cet emplacement...");
		}
	}
}
