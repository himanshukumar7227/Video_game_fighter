package main;

public class Game {
    private Game_window gameWindow;//object instanciation of
    // Game_window class.
    private GamePanel gamePanel;// object instanciation of GamePanel class.
    public Game(){//constructor
        gamePanel =new GamePanel();
        gameWindow =new Game_window(gamePanel);
        gamePanel.requestFocus();


    }
}
