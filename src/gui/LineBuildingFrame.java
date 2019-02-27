package gui;

import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;

import core.Game;
import core.Line;
import core.LineCreator;

public class LineBuildingFrame extends JFrame {
	
	private JLabel labelName;
	private LineCreator lineCreator;

	public LineBuildingFrame(Line line, Game game) {
		this.setSize(300, 300);
		this.setAlwaysOnTop(true);
		this.setUndecorated(true);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
		this.setLayout(new GridLayout(3, 1));
		
		labelName = new JLabel("Ligne : " +line.getName());
		this.add(labelName);
		
		lineCreator = new LineCreator(game.getMap(), game);
		
		
		this.setVisible(true);
	}
}
