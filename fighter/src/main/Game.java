package main;

public class Game {
    private Game_window gameWindow;
    private GamePanel gamePanel;
    //constructor
    public Game(){
        gamePanel =new GamePanel();
        gameWindow =new Game_window(gamePanel);


    }
}
