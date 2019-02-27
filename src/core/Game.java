package core;

import java.awt.BorderLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Scanner;

import javax.swing.JPanel;

import gui.GameFrame;
import gui.InformationFrame;
import gui.MapPanel;
import gui.OptionPanel;

public class Game implements MouseListener {

	private Boolean quit = false;
	private Map map;
	private Tile[][] board;
	
	private BlockCreator blockCreator;
	private StationCreator stationCreator;
	private LineCreator lineCreator;

	private GameFrame gameFrame;
	private MapPanel mapPanel;
	private OptionPanel optionPanel;
	
	private Boolean freeClicking;
	private Boolean lineTracing;

	public Game() {
		// Création de la carte du jeu 
		System.out.println("Creation de la carte...\n");
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
		
		optionPanel = new OptionPanel(map, this);
		gameFrame.getPanel().add(optionPanel, BorderLayout.SOUTH);
		
		freeClicking = true;
		lineTracing = false;
		
		while (!quit) {
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

		// Divide coordinate by the size of a sprite to get the cell in which the user
		// clicked
		coordX = e.getX() / mapPanel.getSpriteSize() + 1;
		coordY = e.getY() / mapPanel.getSpriteSize() + 1;
		
		if(freeClicking)
			new InformationFrame(map, coordX, coordY, this);
			
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
	
	public void setFreeClicking(Boolean state) {
		this.freeClicking = state;
	}

	public Map getMap() {
		return map;
	}
}
