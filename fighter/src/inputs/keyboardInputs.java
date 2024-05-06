package inputs;

import main.GamePanel;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class keyboardInputs implements KeyListener {

    private GamePanel gamePanel;
    public keyboardInputs(GamePanel gamePanel){
        //As we did in mouseListner for using methods of gamPannel we are
        // initializing and calling gampanel here.
        this.gamePanel=gamePanel;
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        //For this useage of method and control the movement
        //we imported gamePannel.
        switch (e.getKeyCode()){
            case KeyEvent.VK_W:
                gamePanel.changeyDelta(-5);
                break;
            case KeyEvent.VK_A:
                gamePanel.changexDelta(-5);
                break;
            case KeyEvent.VK_S:
                gamePanel.changeyDelta(5);
                break;
            case KeyEvent.VK_D:
                gamePanel.changexDelta(5);
                break;
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
}
