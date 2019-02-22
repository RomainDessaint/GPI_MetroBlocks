package gui;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.*;
import core.*;

public class MapPanel extends JPanel implements MouseListener{
	private Map map;
	private int frameSizeX, frameSizeY;
	private Boolean drawResult;
	private int spriteSize;
	private BufferedImage herbSprite, businessTownSprite, residentialSprite, metroStationSprite;
	
	public MapPanel(Map map) {
		this.map = map;
		try {
			herbSprite = ImageIO.read(new File("Images/herb.png"));
			businessTownSprite = ImageIO.read(new File("Images/business.png"));
			residentialSprite = ImageIO.read(new File("Images/LivingArea.png"));
			metroStationSprite = ImageIO.read(new File("Images/MetroStation.png"));
		}
		catch(IOException e) {
			e.printStackTrace();
		}
		this.setVisible(true);
		this.addMouseListener(this);
	}
	
	public void setFrameSizeX(int frameSizeX) {
		this.frameSizeX = frameSizeX;
	}
	public void setFrameSizeY(int frameSizeY) {
		this.frameSizeY = frameSizeY;
	}
	
	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		// Y est le facteur limitant
		if(frameSizeX > frameSizeY*2)
		{
			this.setSize(frameSizeY * 2, frameSizeY);
			spriteSize = this.getSize().height / map.getYSize();
		}
		// X est le facteur limitant
		else
		{
			this.setSize(frameSizeX, (int) (frameSizeX * 0.5));
			spriteSize = this.getSize().width / map.getXSize();
		}
		
		int positionX, positionY;
		
		// System.out.println("Size X : " + map.getXSize());
		// System.out.println("Size Y : " + map.getYSize());
		// System.out.println("Sprite : " + spriteSize);
		
		// Affichage de chaque case
		for(positionX = 0; positionX < map.getYSize(); positionX++) {
			for(positionY = 0; positionY < map.getXSize(); positionY++) {
				switch(map.getBoard()[positionX][positionY].getType()) {
				case 0 :
					drawResult = g.drawImage(herbSprite, positionY * spriteSize, positionX * spriteSize, spriteSize, spriteSize, null);
					break;
				case 1 : 
					drawResult = g.drawImage(herbSprite, positionY * spriteSize, positionX * spriteSize, spriteSize, spriteSize, null);
					drawResult = g.drawImage(residentialSprite, positionY * spriteSize, positionX * spriteSize, spriteSize, spriteSize, null);
					break;
				case 2 :
					drawResult = g.drawImage(herbSprite, positionY * spriteSize, positionX * spriteSize, spriteSize, spriteSize, null);
					drawResult = g.drawImage(businessTownSprite, positionY * spriteSize, positionX * spriteSize, spriteSize, spriteSize, null);
					break;
				case 3 :
					// Quartier de services publics
					break;
				default :
					System.out.println("Type de quartier inconnu");
					break;
				}
				if(map.getBoard()[positionX][positionY].getBlock() != null) {
					if(map.getBoard()[positionX][positionY].getBlock().isHaveStation()) {
						drawResult = g.drawImage(metroStationSprite, positionY * spriteSize, positionX * spriteSize, spriteSize, spriteSize, null);
					}
				}	
			}
		}
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		System.out.print("Coord X :");
		System.out.println(e.getX() / spriteSize + 1);
		
		System.out.print("Coord Y :");
		System.out.println(e.getY() / spriteSize + 1);
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
}