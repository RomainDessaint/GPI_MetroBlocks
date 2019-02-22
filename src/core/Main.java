package core;

import java.awt.BorderLayout;

import gui.GameFrame;
import gui.MapPanel;

public class Main {

	public static void main(String[] args) {
		Boolean quit = false;
		
		//CREATION DE LA CARTE DE JEU
		System.out.println("Creation de la MAP");
		Map map = new Map();
		Tile[][] board = map.createBoard(20, 10);
		map.setBoard(board);
		// map.printBoard();
		// System.out.print("Taille de la carte : (" + map.getXSize() +", " + map.getYSize() +")\n");
		
		//CREATION D'UN QUARTIER 
		System.out.println("\nCreation d'un QUARTIER");
		BlockCreator blockCreator = new BlockCreator(map);
		blockCreator.askCoordinate();
		// map.printBoard();
		
		//CREATION D'UNE STATION DE METRO
		System.out.println("\nCreation de la STATION");
		StationCreator stationCreator = new StationCreator(map);
		stationCreator.askCoordinateStation();
		// map.printBoard();
		
		// The window in which the game is played
		GameFrame gameFrame = new GameFrame(map);
		// The panel in which the actual game takes place
		MapPanel mapPanel = new MapPanel(map);
		// Link the lot
		gameFrame.getPanel().add(mapPanel, BorderLayout.CENTER);
		
		while(!quit) {			
			// Calling the repaint methods to update the graphics
			mapPanel.removeAll();
			mapPanel.revalidate();
			mapPanel.repaint();
			
			// Update the size of the panel of the game to resize the sprites
			mapPanel.setFrameSizeX(gameFrame.getPanel().getSize().width);
			mapPanel.setFrameSizeY(gameFrame.getPanel().getSize().height);
			
			// Small delay to redraw
			try {
				Thread.sleep(50);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}



