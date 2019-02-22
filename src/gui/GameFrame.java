package gui;

import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JPanel;
import core.*;

public class GameFrame extends JFrame {
	JPanel wholePanel = new JPanel();
	BorderLayout mainLayout = new BorderLayout();
	
	public GameFrame(Map map) {
		this.setTitle("MetroBlocks");
	    this.setExtendedState(this.MAXIMIZED_BOTH);
	    this.setLocationRelativeTo(null);
	    this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
	    this.setVisible(true);
	    this.setContentPane(wholePanel);
	    wholePanel.setLayout(mainLayout);
	}

	public JPanel getPanel() {
		return wholePanel;
	}

	public void setPanel(JPanel wholePanel) {
		this.wholePanel = wholePanel;
		wholePanel.setBackground(Color.GREEN);;
	}
	
	public int getXSize() {
		return this.getSize().width;
	}
	public int getYSize() {
		return this.getSize().height;
	}
}