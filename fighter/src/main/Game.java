package main;

public class Game implements Runnable{
    //we are using runnable interface for creation of thread.
    //AS the game loop we used erlier was bad and has too incositent frames
    // which might have created a problem later in our game
    //we are going to build a game loop insted of using 'repaint' simply.
    private Game_window gameWindow;//object instanciation of
    // Game_window class.
    private GamePanel gamePanel;// object instanciation of GamePanel class.
    private Thread gameThread;// We are createing a Thread which will control
    // the game loop.
    private final int FPS_SET=120;//through this we are decieding how much
    //frame must be drawn by the graphics per second.
    private void startGameloop(){
        gameThread=new Thread(this);
        gameThread.start();

    }
    public Game(){//constructor
        gamePanel =new GamePanel();//gamepannel connection
        gameWindow =new Game_window(gamePanel);//gamewindow connection
        gamePanel.requestFocus();//this helps in showing the input data or
        //used to apply the input get from keyboard or mouse.
        startGameloop();


    }

    @Override
    public void run() {

        double timePerFrame=1000000000.0/FPS_SET;//this will decide for how
        //much time a frame will stay on screen which will be in nanosecond.
        long lastFrame=System.nanoTime();//we are initialy
        long now=System.nanoTime();
        int frames=0;
        long lastCheck=System.currentTimeMillis();

        while (true){
            //main game loop
            now=System.nanoTime();
            if(now-lastFrame>=timePerFrame){
                gamePanel.repaint();
                lastFrame=now;
                frames++;
            }
            //this is frames check
            if(System.currentTimeMillis()-lastCheck>=1000){
                lastCheck=System.currentTimeMillis();
                System.out.println("FPS: "+frames);
                frames=0;
            }

        }

    }
}
