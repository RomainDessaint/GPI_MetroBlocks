package gui;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

import core.Map;
import core.Tile;

public class Grid extends JPanel implements ActionListener {

	private static final long serialVersionUID = 1L;

	JButton b[][] = new JButton[20][10];

	int v1[] = { 2, 5, 3, 7, 28 };
	int v2[] = { 3, 5, 6, 9, 12 };
	Map map = new Map();
	// JPanel construct = new JPanel();

	public Grid(String title) {
		// super(title);
		grid(map);
		// construct.setSize(new Dimension(100, 100));
		// construct.setLocation(150, 150);
		setLayout(new GridLayout(20, 10));
		// setBackground(Color.red);
		// add(construct);
		setVisible(true);
		// setDefaultCloseOperation(EXIT_ON_CLOSE );
		// this.add(clickToAction);
	}

	public void grid(Map map) {
		int h, sizeX, sizeY, sizeH;
		Tile[][] board = map.createBoard(10, 20);
		map.setBoard(board);

		sizeX = map.getBoard().length;
		h = 0;
		sizeY = map.getBoard()[0].length;

		for (int i = 0; i < sizeX; i++) {
			for (int j = 0; j < sizeY; j++) {

				b[i][j] = new JButton();
				b[i][j].setSize(5, 5);
				b[i][j].setName(i+""+j);
				b[i][j].addActionListener(this);
				add(b[i][j]);
			}
		}

	}

	@Override
	public void actionPerformed(ActionEvent ae) {

		// ((JButton)ae.getSource()).setBackground(Color.red);
		// BlockCreator a=new BlockCreator(mapp);
		// a.createBlock(mapp, 5, 5, 3);
		// askCoordinate(x,y,type);
		// grid(mapp);
		// JPanel clickToAction = new JPanel(true);
		// clickToAction.setSize(10, 10);
		// JButton residential= new JButton();
		// JButton commertial= new JButton();
		// JButton service= new JButton();
		// clickToAction.add(residential);
		// clickToAction.add(commertial);
		// clickToAction.add(service);

		// clickToAction.setVisible(true);
		// clickToAction.setBorder(BorderFactory.createTitledBorder(
		// BorderFactory.createEtchedBorder(), "Login Panel"));

		// setDefaultCloseOperation(EXIT_ON_CLOSE );
		JButton button = (JButton) ae.getSource();
	    String command = button.getName();
	    System.out.println("i="+command.charAt(0)+"j="+command.charAt(1)+"\n");
	    char is=command.charAt(0);
/*	    		String sj= 
	 //   int i = Character.getNumericValue(is);
	 //   int j = Integer.parseInt(command, command.charAt(1));
	    

		new InfoFrame(map, ((JButton) ae.getSource()).getComponentCount(),
				((JButton) ae.getSource()).getDisplayedMnemonicIndex());*/

	}

}