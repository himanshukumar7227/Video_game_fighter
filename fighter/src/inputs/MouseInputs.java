package inputs;

import main.GamePanel;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

public class MouseInputs implements MouseListener, MouseMotionListener {
    private GamePanel gamePanel;//as we have imported this module we used 'this ' in
    //gamePannel.
    public MouseInputs(GamePanel gamePanel){
        //we are calling gamePanel here so that we can
        //use its methods.
        this.gamePanel=gamePanel;
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        System.out.println("its your mouse.");
    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }

    @Override
    public void mouseDragged(MouseEvent e) {
        //this code will move the rectangle when and where we drag the
        //cursor
        gamePanel.setRectPos(e.getX(),e.getY());
    }

    @Override
    public void mouseMoved(MouseEvent e) {

    }
}
