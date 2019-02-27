package gui;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

import core.Game;
import core.Map;

public class OptionPanel extends JPanel {
	private Map map;
	private JButton buttonBuildLine;

	public OptionPanel(Map map, Game game) {
		this.map = map;
		this.setLayout(new GridLayout(1, 4));
		this.buttonBuildLine = new JButton("Construire une ligne");
		
		buttonBuildLine.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new LineNameFrame(game);
			}
		});
		
		this.add(buttonBuildLine);
	}
}
