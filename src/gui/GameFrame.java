package gui;

import javax.swing.JFrame;

public class GameFrame extends JFrame{
	Grid g = new Grid("MetroBlocks");
   
	
	
	public GameFrame() {
		this.setTitle("MetroBlocks");
	    this.setExtendedState(this.MAXIMIZED_BOTH);
	    this.setLocationRelativeTo(null);
	    this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
	    this.add(g);
	    this.setVisible(true);
	}
}
