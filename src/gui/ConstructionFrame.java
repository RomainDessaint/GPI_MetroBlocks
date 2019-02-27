package gui;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import core.Block;
import core.BlockCreator;
import core.Game;
import core.Map;
import core.StationCreator;

public class ConstructionFrame extends JFrame {
	
	private int x, y, construction, blockTypeToBuild;
	private Map map;
	private JPanel panelFields;
	private JButton buttonBuild, buttonClose;
	private JTextField textFieldName;
	private JLabel labelTile, labelName;
	private BlockCreator blockCreator;
	private StationCreator stationCreator;

	public ConstructionFrame(Map map, int x, int y, int construction, int blockTypeToBuild, Game game) {
		this.map = map;
		this.x = x;
		this.y = y;
		this.construction = construction; /* 1 = construction quartier, 2 = construction station */ 
		this.blockTypeToBuild = blockTypeToBuild;
	
		this.setSize(300,300);
		this.setAlwaysOnTop (true);
		this.setUndecorated(true);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
		this.setLayout(new GridLayout(4, 1));
		
		panelFields = new JPanel();
		panelFields.setLayout(new GridLayout(1, 2));
		textFieldName= new JTextField();
		buttonBuild = new JButton("Construire");
		buttonClose = new JButton("Annuler");
		
		/* Constrution d'un quartier */
		if(construction == 1) {
			blockCreator = new BlockCreator(map);
			this.setTitle("Construire un quartier");
			labelTile = new JLabel("Terrain vierge");
			labelName = new JLabel("Nom du quartier : ");
			buttonBuild.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					if(!textFieldName.getText().equals("")) {
						blockCreator.createBlock(x, y, blockTypeToBuild, textFieldName.getText());
						game.setFreeClicking(true);
						dispose();
					}
				}
			});
		}
		
		/* Construction d'une station */
		if(construction == 2) {
			Block block;
			stationCreator = new StationCreator(map);
			this.setTitle("Construire une station");
			block = map.getBoard()[y-1][x-1].getBlock();
			labelTile = new JLabel("Quartier : "+block.getName());
			labelName = new JLabel("Nom de la station : ");
			buttonBuild.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					if(!textFieldName.getText().equals("")) {
						stationCreator.createStation(map,x,y, textFieldName.getText());
						game.setFreeClicking(true);
						dispose();
					}
				}
			});
		}
		
		this.add(labelTile);
		panelFields.add(labelName);
		panelFields.add(textFieldName);
		this.add(panelFields);
		this.add(buttonBuild);
		this.add(buttonClose);
		
		buttonClose.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				game.setFreeClicking(true);
				dispose();
			}
		});

		this.setVisible(true);
	}
}