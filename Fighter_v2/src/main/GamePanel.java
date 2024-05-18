package main;

import java.awt.*;// For all type of Graphics Related work.

import javax.swing.JPanel;// Panel is like canvas of the Frame.

import inputs.*;//importing inputs.


public class GamePanel extends JPanel{
	
	private MouseInputs mouseInputs;
	private int xDelta=100,yDelta=100;//this will be used to change the position of the rectangle.
	
	public GamePanel() {
		mouseInputs=new MouseInputs(this);/*"this is for gamepanal as we have passed a paremeter in keyboard inputs"*/
			//This is important becase without this "mouseInput" will not be used by "addMouseListener"
			//"addMouseMotionListener"
		addKeyListener(new KeyboardInputs(this));/*"this is for gamepanal as we have passed a paremeter in keyboard inputs"*/
			// Through this line we are connecting keyboardinputs with gamepanel.
		addMouseListener(mouseInputs);// For mouse inputs.
		addMouseMotionListener(mouseInputs);// For mouse movements.
		
	}
	public void changexDelta(int Value) {
		/**this method is for increasing or decreasing the value of xDelta or x direction of the
		 * rectangle.
		 */
		this.xDelta+=Value;
	}
	public void changeyDelta(int Value) {
		/**this method is for increasing or decreasing the value of yDelta or y direction of the
		 * rectangle.
		 */
		this.yDelta+=Value;
	}
	public void setRectPos(int X,int Y) {
		this.xDelta=X;//mouse inputs will be show here. for x.
		this.yDelta=Y;//for y.
	}
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);//this code paints the evrything in the canvas.
		g.fillRect(xDelta,yDelta,200,50);//this will create a rectangle of according 
			//dimension.
		repaint();//this line is like a weak gameloop used here to show the change in position of 
			//rectangle in the window.
		
	}

}
