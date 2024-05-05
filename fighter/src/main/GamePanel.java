package main;
import inputs.MouseInputs;
import inputs.keyboardInputs;

import javax.swing.JPanel;//Jpannel class importing important for drawing stufs
//into the window.
import java.awt.Graphics;//Graphics important for animation.
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class GamePanel extends JPanel{
    private MouseInputs mouseInputs;
    private int xDelta=100,yDelta=100;
    public GamePanel(){//Gamepanel constructor
        mouseInputs= new MouseInputs(this);
        addKeyListener(new keyboardInputs(this));
        addMouseListener(mouseInputs);
        addMouseMotionListener(mouseInputs);

    }
    public void changexDelta(int value){
        this.xDelta+=value;
        repaint();
    }
    public void changeyDelta(int value){
        this.yDelta+=value;
        repaint();
    }
    public void setRectPos(int x,int y){
        this.xDelta=x;
        this.yDelta=y;
        repaint();
    }
    // paintComponent is method defined in Jpannel class which is
    // overwrited here again.
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        g.fillRect(xDelta,yDelta,200,50);//this will draw a rectangele.
    }
}
