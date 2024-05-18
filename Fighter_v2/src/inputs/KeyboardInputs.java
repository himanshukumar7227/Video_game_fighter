package inputs;

import java.awt.event.KeyEvent;//for key events.
import java.awt.event.KeyListener;//for key listening.

import main.GamePanel;//importing gamePanel for linking and passing the keyboard commands.

public class KeyboardInputs implements KeyListener{
	
	private GamePanel gamePanel;
	
	public KeyboardInputs(GamePanel gamePanel) {
		
		this.gamePanel=gamePanel;//this line is required so that we can use the methods of gamepannel to change the 
			//rectangle position.
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		switch(e.getKeyCode()) {
		case KeyEvent.VK_UP:
			gamePanel.changeyDelta(-1);
			break;
		case KeyEvent.VK_DOWN:
			gamePanel.changeyDelta(1);
			break;
		case KeyEvent.VK_RIGHT:
			gamePanel.changexDelta(1);
			break;
		case KeyEvent.VK_LEFT:
			gamePanel.changexDelta(-1);
			break;
		case KeyEvent.VK_W:
			gamePanel.changeyDelta(-1);
			break;
		case KeyEvent.VK_S:
			gamePanel.changeyDelta(1);
			break;
		case KeyEvent.VK_A:
			gamePanel.changexDelta(-1);
			break;
		case KeyEvent.VK_D:
			gamePanel.changexDelta(1);
			break;
		}
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

}
