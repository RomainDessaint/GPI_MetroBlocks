package core;

import java.util.Scanner;

public class StationCreator {

	Map map;
	Scanner scanner;
	
    public StationCreator (Map map) {
		this.map = map;
		this.scanner = new Scanner(System.in);
	}
	
	 void askCoordinateStation() {
		int x, y ;
		String name;
		System.out.println("Coordonnée X ?");
		x = scanner.nextInt();
		System.out.println("Coordonnée Y ?");
		y = scanner.nextInt();
		System.out.println("Nom de la station?");
		name = scanner.next();
		
		createStation(map,x,y,name);
	}
	
	void createStation(Map map, int x, int y, String name) {			

		if (map.getBoard()[y-1][x-1].getBlock() != null ) {

			if (map.getBoard()[y-1][x-1].getBlock().isHaveStation() == false ) {

				map.getBoard()[y-1][x-1].getBlock().setHaveStation(true);	
								
				Station S = new Station (name , 200);
				
				map.getBoard()[y-1][x-1].getBlock().setStation(S);
			}
		}
						
	}
	
	
	
}
