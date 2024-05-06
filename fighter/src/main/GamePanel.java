package main;
import inputs.MouseInputs;
import inputs.keyboardInputs;
import javax.swing.JPanel;//Jpannel class importing important for drawing stufs
//into the window.
import java.awt.*;//for graphics
import java.awt.event.KeyEvent;//importing module for controling the
//the input.
import java.awt.event.KeyListener;//importing module for controling the
//the input.
import java.util.Random;

public class GamePanel extends JPanel{
    //Jpanel is used to create the game internal stuf all we see.
    private MouseInputs mouseInputs;//instanciating MouseInputs object.
    private int frames=0;//initializing frame.
    private long lastCheck=0;//this is used to check the time
    //if not done it will show time from very begning and will not
    //reset.
    private float xDelta=100,yDelta=100;//this is the position of rectangle.
    // At the starting of the loop.
    private float xDir=0.9f,yDir=0.8f;//this is for increamenting
    // 'xDelta' and 'yDelta'.
    private Color color=new Color(24, 150, 20);//creating object of
    //color class for use of differnet colours of the rectangle.
    private Random random;//it for random integers or for random value of
    //colours.
    public GamePanel(){//Gamepanel constructor
        random= new Random();//random module for randowm values of colour codes
        //as you can see in the rectangle
        mouseInputs= new MouseInputs(this);//calling mouse inputs
        //here 'this' is for gamePanel as we have used an argument in mouse input
        addKeyListener(new keyboardInputs(this));//this helps in taking
        //input from keyboard.
        addMouseListener(mouseInputs);//this helps in taking input from
        //mouse
        addMouseMotionListener(mouseInputs);//this is used for motion detection.

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
        g.setColor(color);//this the predefind method used to change colour of
        //rectangle in the gamepannel.
        g.fillRect((int)xDelta,(int)yDelta,200,30);//this will draw a rectangele.

        updateRectangle();// this for updating the position of rectangle


    }

    private void updateRectangle() {
        // this method is for updating the position of rectangle in
        //loop
        xDelta+=xDir;
        if(xDelta>400||xDelta<0){
            //if rectangle goes out of pannel or goes to xposition of
            //0 then we will multiply that position with -1 and and change the
            //colour of rectangle here
            xDir*=-1;
            color = getRndColor();
        }
        yDelta+=yDir;
        if(yDelta>400||yDelta<0) {
            //if rectangle goes out of pannel or goes to yposition of
            //0 then we will multiply that position with -1 and and change the
            //colour of rectangle here
            yDir *= -1;
            color = getRndColor();
        }
    }

    private Color getRndColor() {
        // here we are asignin random r g b vlaue which is later going
        //to used to seen in rectangle when there is specific condition is
        //met.
        int r=random.nextInt(255);
        int b=random.nextInt(255);
        int g=random.nextInt(255);
        return new Color(r,b,g);
    }
}
