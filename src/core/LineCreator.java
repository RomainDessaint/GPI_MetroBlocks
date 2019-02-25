package core;

import java.util.Scanner;

public class LineCreator {

	Map map;
	Scanner actionScanner;
	Scanner scanner;
	
	public LineCreator(Map map) {
		this.map = map;
		this.actionScanner = new Scanner(System.in);
		this.scanner = new Scanner(System.in);
	}

	public Line traceLine() {
		Boolean tracingTerminated = false;
		Tile selectedTile, lastSelectedTile;
		Line line;
		String name;
		int action, x, y, nbCase = 0;
		
		System.out.println("Nom de la ligne ? :");
		name = scanner.next();
		line = new Line(name);
		
		while(!tracingTerminated) {
			nbCase++;
			System.out.println("\nActions possibles :");
			System.out.println("1 - Aménager une case");
			System.out.println("2 - Terminer la construction");
			action = actionScanner.nextInt();
			
			/* ACTION = AMENAGER UNE CASE */
			if(action == 1) {
				System.out.println("Quelle case voulez-vous aménager ?");
				System.out.print("Coordonnée X ? : ");
				x = scanner.nextInt();
				System.out.print("Coordonnée Y ? : ");
				y = scanner.nextInt();
				
				selectedTile = map.getBoard()[y-1][x-1];
				
				/* Il faut vérifier que la première case séléctionnée est un quartier dans lequel une station est construit */
				/* Si la case à aménager est la première case du tracé de la ligne */
				if(nbCase == 1) {
					/* Si la case séléctionnée ne contient même pas de quartier */
					if(selectedTile.getBlock() == null) {
						System.out.println("La première case selectionnee doit etre un quartier contenant une station\n");
					/* Si la case séléctionnée contient un quartier */
					} else {
						/* Si le quartier ne possède pas de station */
						if(!selectedTile.getBlock().isHaveStation()) {
							System.out.println("La première case selectionnee doit etre un quartier contenant une station\n");
						/* Si le quarier possède une station */
						} else {
							line.getStations().add(selectedTile.getBlock().getStation());
							line.getPath().add(selectedTile);
							System.out.println("Case ["+x+"]["+y+"] selectionnee");
						}
					}
					/* Si la case à aménager n'est pas la première case du tracé de la ligne */
				} else {
					/* Si la case séléctionnée contient un quartier */
					if(selectedTile.getBlock() != null) {
						/* Si le quartier possède une station */
						if(selectedTile.getBlock().isHaveStation()) {
							line.getStations().add(selectedTile.getBlock().getStation());
						}
					}
					line.getPath().add(selectedTile);
					System.out.println("Case ["+x+"]["+y+"] selectionnee\n");
				}
			
			/* ACTION = TERMINER LA CONSTRUCTION DE LA LIGNE */
			} else if(action == 2) {
				/* Il faut vérifier que la dernière case séléctionnée par le joueur est un quartier dans lequel une station est construit */
				lastSelectedTile = line.getPath().get(line.getPath().size() -1);
				System.out.println(lastSelectedTile.toString());
				/* Si la case séléctionnée ne contient même pas de quartier */
				if(lastSelectedTile.getBlock() == null) {
					System.out.println("La derniere case selectionnee doit etre un quartier contenant une station\n");
				/* Si la case séléctionnée contient un quartier */
				} else {
					/* Si le quartier ne possède pas de station */
					if(!lastSelectedTile.getBlock().isHaveStation()) {
						System.out.println("La derniere case selectionnee doit etre un quartier contenant une station\n");
					/* Si le quarier possède une station */
					} else {
						tracingTerminated = true;
						System.out.println("Constrution de la ligne terminee\n");
						System.out.println("Ligne " +line.getName() +" : " +line.getPath().toString());
						System.out.println("Stations deservies : " +line.getStations().toString() +"\n");
					}
				}
			} else {
				System.out.println("Choix invalide\n");
			}
		}
		
		return line;
	}

	public Map getMap() {
		return map;
	}	
}
