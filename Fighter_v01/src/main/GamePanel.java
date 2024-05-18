package main;

import java.awt.*;// For all type of Graphics Related work.

import javax.swing.JPanel;// Panel is like canvas of the Frame.

public class GamePanel extends JPanel{
	
	public GamePanel() {
		
	}
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);//this code paints the evrything in the canvas.
		g.fillRect(100,100,200,50);//this will create a rectangle of according 
		//dimension.
		
	}

}
