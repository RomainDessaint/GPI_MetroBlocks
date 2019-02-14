package gui;

import javax.swing.JPanel;

public class MapPanel  {
	public MapPanel() {
		JPanel p = new JPanel();
		Grid g = new Grid("MetroBlocks");
		    g.setVisible(true);
		    
//		    g.setSize(500, 500);
		    p.add(g);
		// add panel to frame 
	}
	
	
}
