package main;

public class Game {
	
	private GameWindow gameWindow;//calling gamewindow
	private GamePanel gamePanel;//calling gamepanel
	
	public Game() {
		gamePanel=new GamePanel();//gamePanel called.
		gameWindow=new GameWindow(gamePanel);//gamewindow is created.
		gamePanel.requestFocus();// this line helps in inputs to apply in the game.
		
	}

}
