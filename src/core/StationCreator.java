package core;

import java.util.Scanner;

public class StationCreator {

	Map map;				//Carte sur laquelle le constructeur agit
	Scanner scanner;

	public StationCreator(Map map) {
		this.map = map;
		this.scanner = new Scanner(System.in);
	}

	//Fonction de spécification des coordonnées de création d'une station
	void askCoordinateStation() {
		int x, y;
		String name;
		System.out.println("Coordonnée X ?");
		x = scanner.nextInt();
		System.out.println("Coordonnée Y ?");
		y = scanner.nextInt();
		System.out.println("Nom de la station?");
		name = scanner.next();

		createStation(map, x, y, name);
	}

	//Fonction de création d'une station
	public void createStation(Map map, int x, int y, String name) {
		if(map.getBoard()[y-1][x-1].getBlock() != null) {
			if(map.getBoard()[y-1][x-1].getBlock().isHasStation() == false) {
				map.getBoard()[y-1][x-1].getBlock().setHaveStation(true);
				Station station = new Station(name, 200);
				map.getBoard()[y-1][x-1].getBlock().setStation(station);
				System.out.println("Station correctement créée.\n");
			} else {
				System.out.println("Ce quartier dispose déja d'une station...\n");
			}
		} else {
			System.out.println("Il n'y a pas de quartier à cet emplacement...\n");
		}

	}

}
