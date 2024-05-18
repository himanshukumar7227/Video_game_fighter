package main;

import javax.swing.JFrame;// It is used for making a window appear.

public class GameWindow {
	private JFrame jframe;
	public GameWindow(GamePanel gamPanel) {
		
		jframe=new JFrame();//this will creat a jframe object.
		
		jframe.setSize(400,400);//this will create the window of size
		//400x400.
		jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//this 
		//helps in closing the programe as the window is closed.
		jframe.add(gamPanel);// This is the gamepannel it is like canvas
		//of the painting frame we will add all esential code in gamepanel.
		jframe.setVisible(true);//by this line we are cammanding to make the 
		//Frame or window visible on the screen.
		
	}

}
