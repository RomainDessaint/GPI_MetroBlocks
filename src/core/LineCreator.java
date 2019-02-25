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
			System.out.println("1 - Am�nager une case");
			System.out.println("2 - Terminer la construction");
			action = actionScanner.nextInt();
			
			/* ACTION = AMENAGER UNE CASE */
			if(action == 1) {
				System.out.println("Quelle case voulez-vous am�nager ?");
				System.out.print("Coordonn�e X ? : ");
				x = scanner.nextInt();
				System.out.print("Coordonn�e Y ? : ");
				y = scanner.nextInt();
				
				selectedTile = map.getBoard()[y-1][x-1];
				
				/* Il faut v�rifier que la premi�re case s�l�ctionn�e est un quartier dans lequel une station est construit */
				/* Si la case � am�nager est la premi�re case du trac� de la ligne */
				if(nbCase == 1) {
					/* Si la case s�l�ctionn�e ne contient m�me pas de quartier */
					if(selectedTile.getBlock() == null) {
						System.out.println("La premi�re case selectionnee doit etre un quartier contenant une station\n");
					/* Si la case s�l�ctionn�e contient un quartier */
					} else {
						/* Si le quartier ne poss�de pas de station */
						if(!selectedTile.getBlock().isHaveStation()) {
							System.out.println("La premi�re case selectionnee doit etre un quartier contenant une station\n");
						/* Si le quarier poss�de une station */
						} else {
							line.getStations().add(selectedTile.getBlock().getStation());
							line.getPath().add(selectedTile);
							System.out.println("Case ["+x+"]["+y+"] selectionnee");
						}
					}
					/* Si la case � am�nager n'est pas la premi�re case du trac� de la ligne */
				} else {
					/* Si la case s�l�ctionn�e contient un quartier */
					if(selectedTile.getBlock() != null) {
						/* Si le quartier poss�de une station */
						if(selectedTile.getBlock().isHaveStation()) {
							line.getStations().add(selectedTile.getBlock().getStation());
						}
					}
					line.getPath().add(selectedTile);
					System.out.println("Case ["+x+"]["+y+"] selectionnee\n");
				}
			
			/* ACTION = TERMINER LA CONSTRUCTION DE LA LIGNE */
			} else if(action == 2) {
				/* Il faut v�rifier que la derni�re case s�l�ctionn�e par le joueur est un quartier dans lequel une station est construit */
				lastSelectedTile = line.getPath().get(line.getPath().size() -1);
				System.out.println(lastSelectedTile.toString());
				/* Si la case s�l�ctionn�e ne contient m�me pas de quartier */
				if(lastSelectedTile.getBlock() == null) {
					System.out.println("La derniere case selectionnee doit etre un quartier contenant une station\n");
				/* Si la case s�l�ctionn�e contient un quartier */
				} else {
					/* Si le quartier ne poss�de pas de station */
					if(!lastSelectedTile.getBlock().isHaveStation()) {
						System.out.println("La derniere case selectionnee doit etre un quartier contenant une station\n");
					/* Si le quarier poss�de une station */
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
