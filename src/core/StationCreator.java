package core;

import java.util.Scanner;

public class StationCreator {

	Map map;				//Carte sur laquelle le constructeur agit
	Scanner scanner;

	public StationCreator(Map map) {
		this.map = map;
		this.scanner = new Scanner(System.in);
	}

	//Fonction de sp�cification des coordonn�es de cr�ation d'une station
	void askCoordinateStation() {
		int x, y;
		String name;
		System.out.println("Coordonn�e X ?");
		x = scanner.nextInt();
		System.out.println("Coordonn�e Y ?");
		y = scanner.nextInt();
		System.out.println("Nom de la station?");
		name = scanner.next();

		createStation(map, x, y, name);
	}

	//Fonction de cr�ation d'une station
	public void createStation(Map map, int x, int y, String name) {
		if(map.getBoard()[y-1][x-1].getBlock() != null) {
			if(map.getBoard()[y-1][x-1].getBlock().isHasStation() == false) {
				map.getBoard()[y-1][x-1].getBlock().setHaveStation(true);
				Station station = new Station(name, 200);
				map.getBoard()[y-1][x-1].getBlock().setStation(station);
				System.out.println("Station correctement cr��e.\n");
			} else {
				System.out.println("Ce quartier dispose d�ja d'une station...\n");
			}
		} else {
			System.out.println("Il n'y a pas de quartier � cet emplacement...\n");
		}

	}

}
