package core;

import java.awt.BorderLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Scanner;

import gui.GameFrame;
import gui.MapPanel;

public class Game implements MouseListener {

	private Boolean quit = false;
	private Map map;
	private Tile[][] board;
	private BlockCreator blockCreator;
	private StationCreator stationCreator;

	private GameFrame gameFrame;
	private MapPanel mapPanel;

	public Game() {
		// CREATION DE LA CARTE DE JEU
		System.out.println("Creation de la MAP");
		map = new Map();
		Tile[][] board = map.createBoard(20, 10);
		map.setBoard(board);

		// The window in which the game is played
		gameFrame = new GameFrame(map);
		// The panel in which the actual game takes place
		mapPanel = new MapPanel(map);
		mapPanel.addMouseListener(this);
		// Link the lot
		gameFrame.getPanel().add(mapPanel, BorderLayout.CENTER);

		while (!quit) {
			// Calling the repaint methods to update the graphics
			mapPanel.removeAll();
			mapPanel.revalidate();
			mapPanel.repaint();

			// Update the size of the panel of the game to resize the sprites
			mapPanel.setFrameSizeX(gameFrame.getPanel().getSize().width);
			mapPanel.setFrameSizeY(gameFrame.getPanel().getSize().height);
			
			printActions();

			// Small delay to redraw
			try {
				Thread.sleep(50);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
	public void printActions() {
		int action;
		Scanner actionScanner = new Scanner(System.in);
		System.out.println("Que voulez-vous faire ?\n");
		System.out.println("1 - Creer un quartier.\n");
		System.out.println("2 - Creer une station.\n");
		System.out.println("3 - Creer une ligne.\n");
		System.out.println("Action ? : \n");
		action = actionScanner.nextInt();
		switch(action) {
			case 1 : 
				actionBlock();
			break;
			case 2 : 
				actionStation();
			break;
			case 3 : 
				actionLine();
			break;
			default : 
				System.out.println("Choix invalide.\n");
		}
	}

	// CREATION D'UN QUARTIER
	public void actionBlock() {
		System.out.println("\nCreation d'un QUARTIER");
		blockCreator = new BlockCreator(map);
		blockCreator.askCoordinate();
	}

	// CREATION D'UNE STATION DE METRO
	public void actionStation() {
		System.out.println("\nCreation de la STATION");
		stationCreator = new StationCreator(map);
		stationCreator.askCoordinateStation();
	}

	public void actionLine() {

	}

	@Override
	public void mouseClicked(MouseEvent e) {
		int coordX, coordY;

		// Divide coordinate by the size of a sprite to get the cell in which the user
		// clicked
		coordX = e.getX() / mapPanel.getSpriteSize() + 1;
		coordY = e.getY() / mapPanel.getSpriteSize() + 1;

		// Debugging : printing
		System.out.println("Coord X : " + coordX);
		System.out.println("Coord Y : " + coordY);
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub

	}

}
