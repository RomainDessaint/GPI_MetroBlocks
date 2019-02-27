package core;

import java.util.Scanner;

public class LineCreator {

	private Map map;
	private Scanner actionScanner;
	private Scanner scanner;
	private Boolean tracing;
	private int lastClickedX;
	private int lastClickedY;
	
	public LineCreator(Map map) {
		this.map = map;
		this.actionScanner = new Scanner(System.in);
		this.scanner = new Scanner(System.in);
		this.tracing = false;
	}

	public Line traceLine() {
		Tile selectedTile, lastSelectedTile;
		Line line;
		String name;
		int action, x, y, lastX, lastY; 
		int nbCase = 0;
		
		System.out.println("Nom de la ligne ? :");
		name = scanner.next();
		line = new Line(name);
		
		while(tracing) {
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
						if(!selectedTile.getBlock().isHasStation()) {
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
					lastSelectedTile = line.getPath().get(line.getPath().size() -1);
					lastX = lastSelectedTile.getCoordinateX();
					lastY = lastSelectedTile.getCoordinateY();
					
					Tile tracingChoice1 = map.getBoard()[lastY-1][lastX];
					Tile tracingChoice2 = map.getBoard()[lastY+1][lastX];
					Tile tracingChoice3 = map.getBoard()[lastY][lastX-1];
					Tile tracingChoice4 = map.getBoard()[lastY][lastX+1];
					
					boolean choice1 = false, choice2 = false, choice3 = false, choice4 = false;
					if(selectedTile.getCoordinateX() == tracingChoice1.getCoordinateX() 
							&& selectedTile.getCoordinateY() == tracingChoice1.getCoordinateY())
						choice1 = true;
					if(selectedTile.getCoordinateX() == tracingChoice2.getCoordinateX()
							&& selectedTile.getCoordinateY() == tracingChoice2.getCoordinateY())
						choice2 = true;
					if(selectedTile.getCoordinateX() == tracingChoice3.getCoordinateX()
							&& selectedTile.getCoordinateY() == tracingChoice3.getCoordinateY())
						choice3 = true;
					if(selectedTile.getCoordinateX() == tracingChoice4.getCoordinateX()
							&& selectedTile.getCoordinateY() == tracingChoice4.getCoordinateY())
						choice4 = true;
					
					if(choice1 || choice2 || choice3 || choice4) {
						/* Si la case s�l�ctionn�e contient un quartier */
						if(selectedTile.getBlock() != null) {
							/* Si le quartier poss�de une station */
							if(selectedTile.getBlock().isHasStation()) {
								line.getStations().add(selectedTile.getBlock().getStation());
							}
						}
						line.getPath().add(selectedTile);
						System.out.println("Case ["+x+"]["+y+"] selectionnee\n");
					} else {
						System.out.println("Veuillez selectionner une case jointe\n");
					}
				}
				
			/* ACTION = TERMINER LA CONSTRUCTION DE LA LIGNE */
			} else if(action == 2) {
				/* Il faut v�rifier que la derni�re case s�l�ctionn�e par le joueur est un quartier dans lequel une station est construit */
				lastSelectedTile = line.getPath().get(line.getPath().size() -1);
				/* Si la case s�l�ctionn�e ne contient m�me pas de quartier */
				if(lastSelectedTile.getBlock() == null) {
					System.out.println("La derniere case selectionnee doit etre un quartier contenant une station\n");
				/* Si la case s�l�ctionn�e contient un quartier */
				} else {
					/* Si le quartier ne poss�de pas de station */
					if(!lastSelectedTile.getBlock().isHasStation()) {
						System.out.println("La derniere case selectionnee doit etre un quartier contenant une station\n");
					/* Si le quarier poss�de une station */
					} else {
						tracing = false;
						System.out.println("Constrution de la ligne terminee\n");
						System.out.println("Ligne " +line.getName() +" : " +line.getPath().toString());
						System.out.println("Stations deservies : " +line.getStations().toString() +"\n");
					}
				}
				
			/* DEFAULT ACTION */
			} else {
				System.out.println("Choix invalide\n");
			}
		}
		return line;
	}

	public Map getMap() {
		return map;
	}	
	
	public void setTracing(Boolean state) {
		this.tracing = state;
	}

	public int getLastClickedX() {
		return lastClickedX;
	}

	public void setLastClickedX(int lastClickedX) {
		this.lastClickedX = lastClickedX;
	}

	public int getLastClickedY() {
		return lastClickedY;
	}

	public void setLastClickedY(int lastClickedY) {
		this.lastClickedY = lastClickedY;
	}
}
