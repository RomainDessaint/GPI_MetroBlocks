package gui;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.LayoutManager;
import java.awt.event.*;
import java.util.ArrayList;

import javax.swing.*;
import core.*;

public class Grid extends JPanel implements ActionListener
{
  /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

JButton b[][] = new JButton[20][10];


  int v1[] = { 2, 5, 3, 7, 28 };
  int v2[] = { 3, 5, 6, 9, 12 };
  Map map=new Map();
//  JPanel construct = new JPanel();
  
  public Grid(String title)
  {
//    super(title);
	  grid(map);
//	  construct.setSize(new Dimension(100, 100));
//	  construct.setLocation(150, 150);
	  setLayout(new GridLayout(20, 10));
//	  setBackground(Color.red); 
//	  add(construct);
	  setVisible(true);
//	    setDefaultCloseOperation(EXIT_ON_CLOSE );
	  //  this.add(clickToAction);
  }
  

  public void grid(Map map) {
	  int h, sizeX, sizeY,sizeH;
	  Tile[][] board = map.createBoard(20, 10);
		map.setBoard(board);
		
		sizeX = map.getBoard().length;
		h=0;
			sizeY = map.getBoard()[0].length;
			
	  for (int i = 0; i < sizeX; i++) {
	      for (int j = 0; j < sizeY; j++)
	      {

	  
					 // si la tuile est de coordonnées i et j
					
						if(map.getBoard()[i][j].getType()==1){ // On cherche le type de la tuile si c'est 1 donc c'est une tuile qui correspont à un quartier residentiel
							b[i][j] = new JButton();
							 b[i][j].setSize(10,10);
			    	        b[i][j].addActionListener(this);
			    	       b[i][j].setBackground(Color.black);
			    	     
			    	        add(b[i][j]);// On ecris R à la place de X
						}
						else if(map.getBoard()[i][j].getType()==2){ // On cherche le type de la tuile si c'est 1 donc c'est une tuile qui correspont à un quartier commertial
							b[i][j] = new JButton();
			    	        b[i][j].addActionListener(this);
			    	       b[i][j].setBackground(Color.GREEN);
			    	        add(b[i][j]);
			    	        b[i][j].setSize(10,10);
							}
						else if(map.getBoard()[i][j].getType()==3){ // On cherche le type de la tuile si c'est 1 donc c'est une tuile qui correspont à un quartier service public
							b[i][j] = new JButton();
							 b[i][j].setSize(10,10);
			    	        b[i][j].addActionListener(this);
			    	       b[i][j].setBackground(Color.yellow);
			    	      
			    	        add(b[i][j]);
			    	       
							}
					else {
						
						b[i][j] = new JButton();
						 b[i][j].setSize(5,5);
	    	        b[i][j].addActionListener(this);
	    	        add(b[i][j]);
				
					}
	      }}
					
				
				}
	    	  
	      
	    	
  

  @Override
  public void actionPerformed(ActionEvent ae) {
	  
  //  ((JButton)ae.getSource()).setBackground(Color.red);
   // BlockCreator a=new BlockCreator(mapp);
//   a.createBlock(mapp,  5, 5, 3);
  //  askCoordinate(x,y,type);
   //grid(mapp);
//   JPanel clickToAction = new JPanel(true);
//   clickToAction.setSize(10, 10);
//    JButton residential= new JButton();
//    JButton commertial= new JButton();
//    JButton service= new JButton();
//    clickToAction.add(residential);
//    clickToAction.add(commertial);
//    clickToAction.add(service);
    
//    clickToAction.setVisible(true);
//    clickToAction.setBorder(BorderFactory.createTitledBorder(
//            BorderFactory.createEtchedBorder(), "Login Panel"));

//    setDefaultCloseOperation(EXIT_ON_CLOSE );
    
    new InfoFrame();
    
  }
 
}