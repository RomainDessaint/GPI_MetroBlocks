package gui;

import java.awt.*;
import javax.swing.*;
import javax.tools.DiagnosticCollector;

import java.util.*;
import core.*;

public class InfoFrame extends JFrame {

	GridLayout monLayout;

	static JButton R = new JButton("Residential block");
	JButton C = new JButton("Commercial block");
	JButton S = new JButton("Public services");
	
	
	public InfoFrame() {

		super("Metroblocks");
		// this.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
		// this.setBounds (500,500, 400, 550);
		
		// getContentPane().setLayout(new GridLayout(3, 1,10,10));
//		getContentPane().setLayout(null);

		JPanel info = new JPanel();
		info.setLayout(new BoxLayout(info, BoxLayout.Y_AXIS)); 
//			R.setBackground(Color.BLACK);
//		R.setText("Residential block");
		R.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				createBlock(map, x, y, type);
			}
		});
		info.add(R);
		info.add(C);
		info.add(S);

		this.add(info);
		this.setSize(200, 150);
		this.setVisible(true);

		// p2.setBackground(Color.blue);
	}

}
