package gui;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class GameFrame extends JFrame{
	MapPanel mapPanel = new MapPanel();
	
	public GameFrame() {
		this.setTitle("MetroBlocks");
	    this.setExtendedState(this.MAXIMIZED_BOTH);
	    this.setLocationRelativeTo(null);
	    this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
	}
}
