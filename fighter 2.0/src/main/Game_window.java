package main;
import javax.swing.JFrame;
public class Game_window {
    private JFrame jframe;
    public  Game_window(GamePanel gamePanel){

        jframe = new JFrame();// important for initialization of window.

        jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);// Due to this as we close the game window programme will be terminated.
        jframe.add(gamePanel); // this will add gamepannel stuf in the window.

        jframe.setResizable(false);//this will disable the featuere of window
        //maximizing and minimizing
        jframe.pack();//this will help us to create frame across the gamepannel.

        jframe.setLocationRelativeTo(null); // this will make main window appear in center of screen.
        jframe.setVisible(true);//this helps in making window visible.
    }
}
