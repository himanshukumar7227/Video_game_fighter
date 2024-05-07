package main;
import inputs.MouseInputs;
import inputs.keyboardInputs;

import javax.imageio.ImageIO;
import javax.swing.JPanel;//Jpannel class importing important for drawing stufs
//into the window.
import java.awt.*;//for graphics
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.InputStream;

public class GamePanel extends JPanel{
    //Jpanel is used to create the game internal stuf all we see.
    private MouseInputs mouseInputs;//instanciating MouseInputs object.
    private keyboardInputs keyboardInputs;
    private int frames=0;//initializing frame.
    private long lastCheck=0;//this is used to check the time
    //if not done it will show time from very begning and will not
    //reset.
    private float xDelta=100,yDelta=100;//this is the position of rectangle.
    // At the starting of the loop.

    private BufferedImage img,subImg;

    public GamePanel(){//Gamepanel constructor

        mouseInputs= new MouseInputs(this);//calling mouse inputs
        //here 'this' is for gamePanel as we have used an argument in mouse input
        keyboardInputs =new keyboardInputs(this);//calling keyboard inputs

        importImage();//from image importing method.
        setPannelSize();//creating window.

        addKeyListener(new keyboardInputs(this));//this helps in taking
        //input from keyboard.
        addMouseListener(mouseInputs);//this helps in taking input from
        //mouse
        addMouseMotionListener(mouseInputs);//this is used for motion detection.

    }

    private void importImage() {
        /* This method help us to import or bring image or involve images in the
        programme.*/
        InputStream is= getClass().getResourceAsStream("/player_sprites.png");
        try {
            img= ImageIO.read(is);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private void setPannelSize() {
        /* This method enable us the create a window on the screen of specific size.*/
        Dimension size=new Dimension(920,520);
        setMinimumSize(size);
        setMaximumSize(size);
        setPreferredSize(size);
    }

    public void changexDelta(int value){
        //this method is used to change the value or position of
        //'xDeta' or position of rectangle so that it looks as rectangle
        //has an animation.
        this.xDelta+=value;
    }
    public void changeyDelta(int value){
        //this method is used to change the value or position of
        //'yDeta' or position of rectangle so that it looks as rectangle
        //has an animation.
        this.yDelta+=value;
    }
    public void setRectPos(int x,int y){
        //this for mouse movement. This method is used in MouseMostionListener
        //so that we can change the position of rectangle using mouse.
        this.xDelta=x;
        this.yDelta=y;
    }
    // paintComponent is method defined in Jpannel class which is
    // overwrited here again.
    //it is a game loop.
    public void paintComponent(Graphics g){
        super.paintComponent(g);//it is predifined method which is
        //override by us to create image in Game Pannel.

        subImg=img.getSubimage(1*64,7*40,64,40);//this will extract the
        //individual images of player

        g.drawImage(subImg,(int)xDelta,(int)yDelta,120,80,null);// this will draw
        //the image of the player in gamepannel at specific location.

    }



}
