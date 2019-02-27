package gui;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JPanel;

import core.Map;

public class OptionPanel extends JPanel {
	private Map map;
	private JButton buttonBuildLine;

	public OptionPanel(Map map) {
		this.map = map;
		this.setLayout(new GridLayout(1, 4));
		this.buttonBuildLine = new JButton("Construire une ligne");
		this.add(buttonBuildLine);
	}
}
