package core;

import java.awt.BorderLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import gui.*;

public class Game implements MouseListener {
	
	private Boolean quit = false;
	private Map map;
	private Tile[][] board;
	private BlockCreator blockCreator;
	private StationCreator stationCreator;
	
	private GameFrame gameFrame;
	private MapPanel mapPanel;
	
	public Game() {
		//CREATION DE LA CARTE DE JEU
		System.out.println("Création de la MAP");
		map = new Map();
		Tile[][] board = map.createBoard(20, 10);
		map.setBoard(board);
		
		//CREATION D'UN QUARTIER 
		System.out.println("\nCréation d'un QUARTIER");
		blockCreator = new BlockCreator(map);
		blockCreator.askCoordinate();
		
		//CREATION D'UNE STATION DE METRO
		System.out.println("\nCréation de la STATION");
		stationCreator = new StationCreator(map);
		stationCreator.askCoordinateStation();
		
		// The window in which the game is played
		gameFrame = new GameFrame(map);
		// The panel in which the actual game takes place
		mapPanel = new MapPanel(map);
		mapPanel.addMouseListener(this);
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
	
	@Override
	public void mouseClicked(MouseEvent e) {
		int coordX, coordY;
		
		// Divide coordinate by the size of a sprite to get the cell in which the user clicked
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
